
public class multipleChoice implements Question
{
	//Save all multiple choice answers
	private int[] databaseMC;
	
	public multipleChoice()
	{
		databaseMC = new int[4];
	}
	
	//Get database if needed
	@Override
	public int[] getDatabase() {
		return databaseMC;
	}
	
	//Add answer to database
	@Override
	public int setAnswer(int randomIndex)
	{
		return databaseMC[randomIndex]++;
	}
	
	//Delete old answer and add new answer
	@Override
	public void changeAnswer(int firstChoice, int secondChoice) {
		databaseMC[firstChoice]--;
		databaseMC[secondChoice]++;
	}
	
	//Check question type
	@Override
	public questionType getType()
	{
		return questionType.MULTIPLE_CHOICE;
	}
	
	//Print all answers from database
	@Override
	public String toString(){
		
		return "----------------------\n" + "| "
					+ "A: " + databaseMC[0] 
					+ " B: " + databaseMC[1] 
					+ " C: " + databaseMC[2]
					+ " D: " + databaseMC[3] + "| "
					+ "\n----------------------";
	}	
}
