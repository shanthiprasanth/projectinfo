
public class Project {
	private int projectId;
	private String projectName;
	private String headOfTheProject;
	private int numOfMembers;
	
	//constructor
	public Project(int projectId, String projectName, String headOfTheProject, int numOfMembers) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.headOfTheProject = headOfTheProject;
		this.numOfMembers = numOfMembers;
	}

	//setters and getters
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getHeadOfTheProject() {
		return headOfTheProject;
	}

	public void setHeadOfTheProject(String headOfTheProject) {
		this.headOfTheProject = headOfTheProject;
	}

	public int getNumOfMembers() {
		return numOfMembers;
	}

	public void setNumOfMembers(int numOfMembers) {
		this.numOfMembers = numOfMembers;
	}
}
