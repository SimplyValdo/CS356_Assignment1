
public class singleChoice implements Question
{
	//Save all single choice answers
	private int[] databaseSC;
	
	public singleChoice()
	{
		databaseSC = new int[2];
	}
	
	//Get database if needed
	@Override
	public int[] getDatabase() {
		return databaseSC;
	}

	//Add answer to database
	@Override
	public int setAnswer(int randomIndex)
	{
		return databaseSC[randomIndex]++;
	}
	
	//Delete old answer and add new answer
	@Override
	public void changeAnswer(int firstChoice, int secondChoice) {
		databaseSC[firstChoice]--;
		databaseSC[secondChoice]++;
	}

	//Check question type
	@Override
	public questionType getType() {
		
		return questionType.SINGLE_CHOICE;
	}

	//Print all answers from database
	@Override
	public String toString(){
		
		return "---------------------\n" + "| "
				+ "True: " + databaseSC[0] 
				+ " False: " + databaseSC[1] + " |"
				+ "\n---------------------" ;
	}
}
