import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class cost implements Comparator<Project>{

	@Override
	public int compare(Project o1, Project o2) {
		return Double.compare(o1.projectCost, o2.projectCost);
	}
}

public class Tester {
	
	// Load data from db
	public static Set<Project> load() {
	    Set<Project> projects = new HashSet<>(); // Initialize the set
	    try (FileInputStream fis = new FileInputStream("project.db")
	    		{
	        ObjectInputStream loader = new ObjectInputStream(fis)) {
	        projects = (Set<Project>) loader.readObject();
	        System.out.println("Data Loaded Successfully...");
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    }
	    return projects;
	}

	
  //menu
	public static int menus(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Add Following Projects in the Set");
		System.out.println("2. Input a Project from user and add in Set");
		System.out.println("3. Display all Projects in Set");
		System.out.println("4. Delete a Project by Id from Set");
		System.out.println("5. Copy All Projects from Set to ArrayList");
		System.out.println("6. Display all Projects from List");
		System.out.println("7. Sort all Projects in List by cost");
		System.out.println("8. Find project with Max team size using Collections.max()");
		System.out.println("9. Count all Projects of \"Java\" technology using Stream API");
		System.out.println("Please Enter Your Choice : ");
		return sc.nextInt();
	}

	//main()
	public static void main(String[] args) {
		
		Set<Project> pro = load();
		List<Project> l1 = new ArrayList<Project>();
		Scanner sc = new Scanner(System.in);
		int choice;
		while((choice = menus(sc)) != 0) {
			switch (choice) {
			case 1:
				adddefault(pro);
				break;
	
			case 2: 
				add(pro,sc);
				break;
			
			case 3: 
				display(pro);
				break;
				
			case 4: 
				deleteId(pro,sc);
				break;
			
			case 5: 
				l1 = copyToArrayList(pro,l1);
				break;
			
			case 6: 
				displayList(l1);
				
				break;
				
			case 7: 
				sortListByCost(l1);
				break;
				
			case 8: 
				maxTeamSize(pro);
				break;
				
			case 9: 
				projectjava(pro);
				break;
			default:
				System.out.println("!!!!!!!!\nPlease Select Correct Option\n!!!!!!!!");
				break;
			}
		}
		System.out.println("Thank You For Using Our App......");
		save(pro);

	}
	
	public static void save(Set<Project> projects) {
        try (FileOutputStream fos = new FileOutputStream("project.db");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(projects);
            System.out.println("Projects saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving projects to file: " + e.getMessage());
        }
    }
	
	//default project
	public static void adddefault(Set<Project> project){ 
		Project p1 = new Project(1, "Train Reservation System",7, 5000000, "Java");
		Project p2 = new Project(2, "Airline Reservation System",3, 6000000, ".NET");
		Project p3 = new Project(4, "Online Grocery Shop", 6, 3000000, "Java"); 
		Project p4 = new Project(5, "Online Book Shop", 2, 3000000, ".NET");
		Project p5 = new Project(3, "Online Jewelry Shop", 4, 4000000, "Java");
		Project p6 = new Project(2, "Bus Reservation System", 3, 3500000, "JS");
//		System.out.println("Default projects added to set");
		
		System.out.println("*******************");
		addIfAbsent(project, p1);
	    addIfAbsent(project, p2);
	    addIfAbsent(project, p3);
	    addIfAbsent(project, p4);
	    addIfAbsent(project, p5);
	    addIfAbsent(project, p6);
	    System.out.println("*******************");
	}
	
	private static void addIfAbsent(Set<Project> projectSet, Project project) {
		if (projectSet.add(project)) {
	        System.out.println("Added: "+project.getId() +" - "+ project.getTitle());
	    } else {
	        System.out.println("Project Already Exists With Id & Title : "+project.getId() +" - " + project.getTitle());
	    }
	}
	
	//add new project
	public static void add(Set<Project> project,Scanner sc) {  
		System.out.print("Please Enter Project Id : ");
		int id = sc.nextInt();
		sc.nextLine(); 
		System.out.print("Please Enter Project Title : ");
		String title = sc.nextLine();
		System.out.print("Please Enter Team Size : ");
		int size = sc.nextInt();
		System.out.print("Please Enter Project Cost : ");
		double projectCost = sc.nextDouble();
		System.out.print("Please Enter Project Technology Used : ");
		String technology = sc.next();
		
		if(project.add(new Project(id,title,size,projectCost,technology))) {
			System.out.println("Project Added Successfully...");
		}
		else {
			System.out.println("Project With This Id Already Exists...");
		}
	}
	
	//display all project
	public static void display(Set<Project> project) { 

		project.forEach(System.out::println);
	}
	
	public static void deleteId(Set<Project> projects,Scanner sc) { 
		System.out.println("Enter Project ID TO Delete A Project : ");
		int id = sc.nextInt();
		boolean removed = projects.removeIf(project-> project.getId() == id);
		if(removed) {
			System.out.println("Project Removed");
		}
		else {
			System.out.println("Project Not Exist!!!");
		}
	}

	public static List<Project> copyToArrayList(Set<Project> project, List<Project> list) { 
		list = new ArrayList<Project>(project);
		System.out.println("Project Set Copied to list");
		return list;

	}
	
	public static void displayList(List<Project> projectList) { 
		projectList.forEach(System.out::println);
	}
	
	public static void sortListByCost(List<Project> projectList) {
	    projectList.stream()
	              .sorted(new cost())
	              .forEach(System.out::println);  // Sort by cost and print
	}
	
	public static void maxTeamSize(Set<Project> projects) { 
		Project maxTeamProject = Collections.max(projects, Comparator.comparingInt(Project::getTeamSize));
        System.out.println("Project with max team size: " + maxTeamProject);
	}

	//display how many project on java
	public static void projectjava(Set<Project> project) {
        long count = project.stream().filter(proj -> "Java".equalsIgnoreCase(proj.getTechnogy())).count();
        System.out.println("#####\nNumber of Java projects: " + count+"\n#####");
	}

}
