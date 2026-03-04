
public class Student {
	private int studentId;
	private String studentName;
	public Student(int studentId,String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
	}
	public Student getDeatils() {
		return this;
		
	}
	public void update(String assignment, Teacher teacher) {
		System.out.println(this.studentName+" received notification: "+teacher.getTeacherName()+ "posted assignment");
		
	}
	public void enroll(Teacher teacher) {
		 teacher.addStudent(this);
	 }
	public void unenroll(Teacher teacher) {
		teacher.removeStudent(this);
	}

}
