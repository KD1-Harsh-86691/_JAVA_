import java.io.Serializable;
import java.util.Objects;

public class Project implements Serializable{
	
	 int id;
	 String title; 
	 int teamSize; 
	 double projectCost; 
	 String technology;
	
	 public Project() {}
	 
	 public Project(int id, String title, int teamSize, double projectCost, String technology) {
		super();
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project project = (Project) obj;
		return id == project.id;
	}

	@Override
	public String toString() {
		return "**********************\nProject Id : " + id + "\nProject title : " + title + "\nTeam Size : " + teamSize + "\nProject Cost : " + projectCost
				+ "\nTechnology Used : " + technology + "\n**********************";
	}
	
	public String getTitle() {
        return title;
    }

	public int getId() {
		return id;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public String getTechnogy() {
		return technology;
	}
	
}
