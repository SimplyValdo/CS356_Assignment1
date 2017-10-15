
public class multipleChoice implements Question
{

	private int[] databaseAnswers;
	
	public multipleChoice()
	{
		databaseAnswers = new int[4];
	}

	@Override
	public int setRandomAnswer(int randomIndex)
	{
		return databaseAnswers[randomIndex];
	}
	
	public questionType getType()
	{
		return questionType.MULTIPLE_CHOICE;
	}
	
}
