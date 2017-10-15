
public class Student 
{

	private String studentID;
	private int answer;
	
	public Student(String uniqueID){
		this.studentID = uniqueID;
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
