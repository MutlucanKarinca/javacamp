package ödev;

public class InstructorManager extends UserManager{
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getCourse()+" kursunu oluþturdunuz.");
	}
	
	public void removeCourse(Instructor instructor) {
		System.out.println(instructor.getCourse()+" kursunu kaldýrdýnýz.");
	}

}
