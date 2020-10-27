package schoolManagement;

import java.util.ArrayList;
import java.util.Scanner;

	public class Driver {
		
		
		//情報を出力するメソッド作成
		public static void printInformation(ArrayList<Course> courseList) {
			for(Course i : courseList) {  //Courseはファイル名、 CourseListはそのアレイリストの名前
				System.out.println("Course name is "+  i.getCourseName() + 
								   "\nwhich takes " + i.getDuration() +  "weeks." +
							       "\nThe Instructor of this course is " + i.getInstructor().getFirstName()+ " "+ i.getInstructor().getLastName() +
							       "\nWho is " + i.getInstructor().getStatus() + 
							       "\nThe Phone number of Instructor is" + i.getInstructor().getPhoneNum()+ ".\n");
			}
		}
		
		//先生の名前でコースを探すメソッド作成	
		public static String findCourse(ArrayList<Course> courseList, String instructorName) {
			for(Course i : courseList) {
				if(i.getInstructor().getFirstName().equalsIgnoreCase(instructorName)) {
					return i.getCourseName();
				} 		
			}  //なんでelseじゃないかというと、エルスだと1個目で出なかったら終わっちゃうから。まずは全部の中にあるか見て、なければ次に進むようにしなければいけない。
			return "teacher doesn't here";
		}
		
	
	


	public static void main(String[] args) {
		
		
		//CourseListというアレイリストを作る　*<Course>はファイル名と同じじゃないとダメ。
		ArrayList<Course> courseList = new ArrayList<Course>();
		
		//Instructorページの　public Instructor(String firstName, String lastName, String phoneNum, int experienceYear)
		//作ったやつのオブジェクトに新しく情報を入れて作成。
		Instructor instructor1 = new Instructor("Jane1", "Doe", "111-111-1111", 3 );
		Instructor instructor2 = new Instructor("Jane2", "Doe", "112-111-1111", 2 );
		Instructor instructor3 = new Instructor("Jane3", "Doe", "113-111-1111", 1 );
		Instructor instructor4 = new Instructor("Jane4", "Doe", "114-111-1111", 5 );
		
		//Courseページのpublic Course(String courseName, int duration, Instructor instructor)
		//作ったやつのオブジェクトに新しく情報を入れて作成。instructorには作ったインストラクターが入る。？
		Course course1 = new Course("Java", 4, instructor1);
		Course course2 = new Course("Javascript", 4, instructor2);
		Course course3 = new Course("CSS", 4, instructor3);
		Course course4 = new Course("HTML", 4, instructor4);
		
		//上で作成したアレイリストにコースを追加する。
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		courseList.add(course4);
		
		//作ったインフォメーションを出すメソッドに4つのコースリストを入れる　→　４つのコースが出てくる
		printInformation(courseList);
		
		//スキャナーセット
		Scanner input = new Scanner(System.in);
		//スキャナーで先生の名前をきく
		System.out.println("Enter instructor's first Name: ");
		//聞いた内容を先生の名前に入れる。
		String instructorName = input.nextLine();
		
		//聞いた内容を先生の名前に入れる。
		System.out.println(findCourse(courseList, instructorName));
		
		
	}

}
