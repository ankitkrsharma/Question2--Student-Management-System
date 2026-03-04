import java.util.ArrayList;

public class Teacher {
	private int teacherId;
	private String teacherName;
	private ArrayList<Student> students;
	public Teacher(int teacherId,String teacherName) {
		this.teacherId=teacherId;
		this.teacherName=teacherName;
		this.students=new ArrayList<Student>();
		
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(Student student) {
		students.remove(student);
		
	}
	public void notifyAssignmnet(String assignment) {
		
		System.out.println("New assignment posted");
		
	}
	public void postAssignment(String assignment) {
		
		System.out.println(this.teacherName+"posted new assignment");
		
	}
	

}
