public class Student{
		public String StudentName;
		public int StudentNumber;
		public String StudentInformation;
		public int StudentGrade;
		public int StudentPhoneNumber;

		public Student(String StudentName,int StudentNumber,String 
		StudentInformation,int StudentGrade,int StudentPhoneNumber){
			this.StudentName = StudentName;
			this.StudentNumber = StudentNumber;
			this.StudentInformation = StudentInformation;
			this.StudentGrade = StudentGrade;
			this.StudentPhoneNumber = StudentPhoneNumber; 
		}	
		public int getStudentNumber(){
			return StudentNumber;
		}
		public String getStudentName(){
			return StudentName;
		}
		public int getStudentPhoneMumber(){
			return StudentPhoneNumber;
		}
		public String getStudentInformation(){
			return StudentInformation;
		}
		public int getStudentGrade(){
			return StudentGrade;
		}
}