
public class singleChoice implements Question
{
	
	private int[] databaseAnswers;
	
	public singleChoice()
	{
		databaseAnswers = new int[2];
	}
	
	@Override
	public int setRandomAnswer(int randomIndex)
	{
		return databaseAnswers[randomIndex];
	}

	@Override
	public questionType getType() {
		
		return questionType.SINGLE_CHOICE;
	}
	

}
