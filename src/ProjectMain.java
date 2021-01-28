public class ProjectMain {

	public static void main(String[] args) {
		Project myProject = new Project(1521,"Bank Application", "Gopi", 20);
		
		System.out.println("Project ID is " + myProject.getProjectId());
		System.out.println("The name of the project is " + myProject.getProjectName());
		System.out.println("The head of the project is " + myProject.getHeadOfTheProject());
		System.out.println("There are " + myProject.getNumOfMembers() + " members in the project");	
	}
}
