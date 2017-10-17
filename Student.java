
public class Student
{
	/* Model class that holds student properties with setters & getters */
	
	private String studentID;
	private int answer;
	
	public Student(String uniqueID, int answer){
		this.studentID = uniqueID;
		this.answer = answer;
	}
	
	public String getUniqueID() {
		return studentID;
	}
	
	public void setUniqueID(String uniqueID) {
		this.studentID = uniqueID;
	}
	
	public int getAnswer() {
		return this.answer;
	}
	
	public void setAnswer(int answer) {
		this.answer = answer;
	}
}
