package �dev;

public class InstructorManager extends UserManager{
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getCourse()+" kursunu olu�turdunuz.");
	}
	
	public void removeCourse(Instructor instructor) {
		System.out.println(instructor.getCourse()+" kursunu kald�rd�n�z.");
	}

}
