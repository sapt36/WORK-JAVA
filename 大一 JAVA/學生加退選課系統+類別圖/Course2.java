/**
 * Class: java programming
 * Instructor: Dr. Li
 * Due: 10/07/2020 23:00
 */
public class Course2
{
	private String[] students = new String[50];
	private String teacherName;
	private String courseName;
	private String courseIntro;
	private String courseCode;
	private int numOfStudents;
	
	public Course2(String CourseName,String TeacherName
				,String CourseIntro,String CourseCode)
	{
		this.courseName = CourseName;
		this.teacherName = TeacherName;
		this.courseIntro = CourseIntro;
		this.courseCode = CourseCode;
	}
	public void addStudent(String student)
	{
		students[numOfStudents] = student;
		numOfStudents++;
	}
	public boolean get(int code)
	{
		
		switch (code)
		{
			case 0:
				System.out.println("Exiting");
				System.out.println("Thanks u");
				System.out.println("");
				return false;
			case 1:
				getCourseCode();
				System.out.println("");
				return true;
			case 2:
				getnumOfStudents();
				System.out.println("");
				return true;
			case 3:
				getCourseIntro();
				System.out.println("");
				return true;
			case 4:
				getStudentName();
				System.out.println("");
				return true;
			case 5:
				getCourseName();
				System.out.println("");
				return true;
			case 6:
				getTeacherName();
				System.out.println("");
				return true;
			default:
				System.out.println("error!Please type it again.");
				System.out.println("");
				return true;
		}
	}
	public void getCourseCode()
	{
		System.out.println("The Coursecode is " + this.courseCode);
	}
	public void getnumOfStudents()
	{
		System.out.println("The number of students is " + this.numOfStudents);
	}
	public void getCourseIntro()
	{
		System.out.println("The Course Introdution is: " + this.courseIntro);
	}
	public void getStudentName ()
	{
		System.out.println("Names of all students in the class : ");
		System.out.println("");
		for(int i=0;i<students.length;i++)
		{
			if(students[i]!=null)
			System.out.println(students[i]);
		}
	}
	public void getCourseName()
	{
		System.out.println("The Coursename is " + this.courseName);
	}
	public void getTeacherName()
	{
		System.out.println("The teacher of this Course is " + this.teacherName);
	}
}