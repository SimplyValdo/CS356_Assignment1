import java.util.HashMap;
import java.util.Map;

public class IVoteService 
{
	private Question question;
	private Map<String,Integer> students;
	
	public IVoteService(Question question)
	{
		this.question = question;
		this.students =  new HashMap<>();
	}
	
	//Receive an answer from a student
	public void submit(Student a){

		//Check if student already submitted before.
		if(students.containsKey(a.getUniqueID()))
			question.changeAnswer(students.get(a.getUniqueID()),a.getAnswer());
		else
			question.setAnswer(a.getAnswer());
		
		//Save answer from specific student on HashMap
		students.put(a.getUniqueID(), a.getAnswer());
	}
	
	//Display all submissions
	public void displayAllSubmissions(){
		
		System.out.println("\nTotal Submissions");
		System.out.println(question);	
	}
	
	//Get number of students
	public int getNumberOfUniqueStudents(){
		return students.size();
	}
}
