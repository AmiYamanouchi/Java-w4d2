package schoolManagement;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private int duration;
	private ArrayList<Student> students;   //コースには学生は複数入れるからアレイリスト
	
	//constructor
	public Course(String courseName, int duration, ArrayList<Student> student) {
		setCourseName(courseName);
		setDuration(duration);
		setStudents(student);
	}
	
		
	//getter
	public String getCourseName() {
		return courseName;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public ArrayList<Student> getstudents(){
		return students;
	}
	
	
	//setter
	
	public void setCourseName(String courseName) {
		if (!courseName.isEmpty() && !courseName.equalsIgnoreCase(null)) {
			this.courseName = courseName;
		} else {
			this.courseName = "Unknown";
		}
	}
	
	public void setDuration(int duration) {
		if (duration >= 4) {
			this.duration = duration;
		} else {
			this.duration = 4;
		}
	}
	
	
	public void setStudents(ArrayList<Student> students){
		this.students = students;
	}
	
	
}
