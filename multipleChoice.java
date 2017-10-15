
public class multipleChoice implements Question
{

	private int[] databaseMC;
	
	public multipleChoice()
	{
		databaseMC = new int[4];
	}
	
	@Override
	public int[] getDatabase() {
		return databaseMC;
	}

	@Override
	public int setAnswer(int randomIndex)
	{
		return databaseMC[randomIndex]++;
	}
	
	@Override
	public questionType getType()
	{
		return questionType.MULTIPLE_CHOICE;
	}
	
}
