package �dev;

public class Main {

	public static void main(String[] args) {
		 
		Instructor instructor=new Instructor
				(1, "Engin", "Demiro�", "engin@demiro�.com", "12345", "Java");
		
		Student student=new Student
				(2, "Mutlucan", "Kar�nca", "mutlucan@karinca.com", "2345", "Java");
	
		StudentManager studentManager=new StudentManager();
		studentManager.addUser(student);
		studentManager.login(student);
		studentManager.logout(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.addUser(instructor);
		instructorManager.login(instructor);
		
		
	
	
	
	}

}
