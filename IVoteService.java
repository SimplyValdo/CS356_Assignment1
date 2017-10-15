
public class IVoteService 
{
	private Question question;
	private int[] MCResults;
	private int[] SCResults;
	
	public IVoteService(Question question)
	{
		this.question = question;
		this.MCResults = new int[4];
		this.SCResults = new int[2];
	}
	
	public void acceptAllSubmissions(int index){
		
		if(question.getType() == Question.questionType.MULTIPLE_CHOICE){
			
			MCResults[index]++;
		}
		else{
			
			SCResults[index]++;
		}
	}
	
	public void displayAllSubmissions()
	{
		if(question.getType() == Question.questionType.MULTIPLE_CHOICE){
			
			System.out.println("A: " + MCResults[0]);
			System.out.println("B: " + MCResults[1]);
			System.out.println("C: " + MCResults[2]);
			System.out.println("D: " + MCResults[3]);
		}
		else{
			
			System.out.println("Right: " + SCResults[0]);
			System.out.println("Wrong: " + SCResults[1]);
		}
	}
}
