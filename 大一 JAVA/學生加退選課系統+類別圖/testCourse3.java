/**
 * Class: java programming
 * Instructor: Dr. Li
 * Due: 10/07/2020 23:00
 */
import java.util.Scanner;
public class testCourse3
{
	public static void main(String[] args)
	{
		Course2 course1 = new Course2("Foundation of computer science","Dr. LeeBrain","Introduction the computer and its ability.","11");
		Course2 course2 = new Course2("Dance class : popping","Mr. lilzoo","Enhancing your dancing skill!","22");
		Course2 course3 = new Course2("Classical Music","Mr. Jennifer","Show you how to stay with classical music and fall in love with it~ ","33");
		Course2 course4 = new Course2("Information Security","Dr.Handsome","Nowadays,you can get in touch with internet everywhere.In contrast,everyone can get your information.So,you need to learn with me.","44");
		course1.addStudent("LEWIS");course1.addStudent("JESSE");
		course1.addStudent("HANK");course1.addStudent("PATRICK");
		course1.addStudent("OLIVER");course1.addStudent("LANDON");
		course2.addStudent("DRAKE");course2.addStudent("HAYLEY");
		course2.addStudent("WISEMAN");course2.addStudent("WADE");
		course2.addStudent("JESSICA");course2.addStudent("MEME");
		course3.addStudent("NEAL");course3.addStudent("IVY");
		course3.addStudent("MADDOX ");course3.addStudent("ZYAN");
		course3.addStudent("KING");course3.addStudent("GEN");
		course4.addStudent("CHENNT");course4.addStudent("Lulu");
		course4.addStudent("GOOOOGLE");course4.addStudent("BRAIN");
		course4.addStudent("PlEASE");course4.addStudent("SWITCH");
		int usingcode=0;
		int coursecode=0;
		Scanner UWantToCho = new Scanner(System.in);
		do
		{
			System.out.println("please choose the Coursecode.");
			System.out.println("[11] Foundation of computer science");
			System.out.println("[22] Dance class : popping");
			System.out.println("[33] Classical Music");
			System.out.println("[44] Information Security");
			coursecode = UWantToCho.nextInt();
			switch(coursecode)
			{
				case 11:
					do
					{ 
						System.out.println("This is course oneone.please enter the code.");
						System.out.println("[0]exit");
						System.out.println("[1]Course Code");
						System.out.println("[2]Total Number Of Students");
						System.out.println("[3]Course Intro.");
						System.out.println("[4]Student Name");
						System.out.println("[5]Course Name");
						System.out.println("[6]Teacher Name");
						usingcode = UWantToCho.nextInt();
						course1.get(usingcode);
					}while(usingcode!=0);
					break;
				case 22:
					do
					{ 
						System.out.println("This is course twotwo.please enter the code.");
						System.out.println("[0]exit");
						System.out.println("[1]Course Code");
						System.out.println("[2]Total Number Of Students");
						System.out.println("[3]Course Intro.");
						System.out.println("[4]Student Name");
						System.out.println("[5]Course Name");
						System.out.println("[6]Teacher Name");
						usingcode = UWantToCho.nextInt();
						course2.get(usingcode);
					}while(usingcode!=0);
					break;
				case 33:
					do
					{ 
						System.out.println("This is course threethree.please enter the code.");
						System.out.println("[0]exit");
						System.out.println("[1]Course Code");
						System.out.println("[2]Total Number Of Students");
						System.out.println("[3]Course Intro.");
						System.out.println("[4]Student Name");
						System.out.println("[5]Course Name");
						System.out.println("[6]Teacher Name");
						usingcode = UWantToCho.nextInt();
						course3.get(usingcode);
					}while(usingcode!=0);
					break;
				case 44:
					do
					{ 
						System.out.println("This is course fourfour.please enter the code.");
						System.out.println("[0]exit");
						System.out.println("[1]Course Code");
						System.out.println("[2]Total Number Of Students");
						System.out.println("[3]Course Intro.");
						System.out.println("[4]Student Name");
						System.out.println("[5]Course Name");
						System.out.println("[6]Teacher Name");
						usingcode = UWantToCho.nextInt();
						course4.get(usingcode);
					}while(usingcode!=0);
			}
			
		}while(coursecode!=0);UWantToCho.close();
		
	}
}