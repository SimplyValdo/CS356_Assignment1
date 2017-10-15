
public class IVoteService 
{
	private Question question;
	
	public IVoteService(Question question)
	{
		this.question = question;
	}
	
	public void acceptAllSubmissions(int index){
		
		if(question.getType() == Question.questionType.MULTIPLE_CHOICE)
			question.setAnswer(index);
		else
			question.setAnswer(index);
	}
	
	public void displayAllSubmissions()
	{
		System.out.println("\nTotal Submissions: ");
		
		if(question.getType() == Question.questionType.MULTIPLE_CHOICE){
			
			int[] MCResults = question.getDatabase();
			
			System.out.println("A: " + MCResults[0]);
			System.out.println("B: " + MCResults[1]);
			System.out.println("C: " + MCResults[2]);
			System.out.println("D: " + MCResults[3]);
		}
		else{
			
			int[] SCResults = question.getDatabase();
			
			System.out.println("Right: " + SCResults[0]);
			System.out.println("Wrong: " + SCResults[1]);
		}
	}
}
