
public class singleChoice implements Question
{
	private int[] databaseSC;
	
	public singleChoice()
	{
		databaseSC = new int[2];
	}
	
	@Override
	public int[] getDatabase() {
		return databaseSC;
	}

	@Override
	public int setAnswer(int randomIndex)
	{
		return databaseSC[randomIndex]++;
	}

	@Override
	public questionType getType() {
		
		return questionType.SINGLE_CHOICE;
	}
}
