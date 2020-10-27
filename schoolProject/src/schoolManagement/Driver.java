package schoolManagement;

import java.util.ArrayList;

public class Driver {
	
	
	
		public static void printCourse(Course c) {
		
			System.out.println("Course name is "+  c.getCourseName() + 
							   "which takes " + c.getDuration() + 
							   "\nAuthor Name : " + c.getDuration() + "weeks." 
		);
		
			getStudentList(c.getstudents());
			
		
	}


	public static void getStudentList(ArrayList<Student> studList) {
		for(Student s : studList) {
			System.out.println((s.getFirstName() + " " + s.getLastName())); 
		}
	}


	public static void main(String[] args) {
		
		ArrayList<Course> nameList = new ArrayList<>();
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student("John", "Dow");
		Student s2 = new Student("Sarah", "green");
		Student s3 = new Student("Ann", "Smith");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		

		
		Course course1 = new Course("Java", 4, students);
//		Course course2 = new Course("Javascript", 4, students);
//		Course course3 = new Course("CSS", 4, students);
//		Course course4 = new Course("HTML", 4, students);
		
		
		nameList.add(course1);
//		nameList.add(course2);
//		nameList.add(course3);
//		nameList.add(course4);
		
		printCourse(course1);
		
	}

}
