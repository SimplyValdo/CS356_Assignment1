
public interface Question 
{
	//Hold questionType variables
	public enum questionType{
        MULTIPLE_CHOICE,
        SINGLE_CHOICE
    }
	
	//Methods that a class must implement if it uses this interface
	public int[] getDatabase();
	public int setAnswer(int num);
	public void changeAnswer(int firstChoice, int secondChoice);
	public questionType getType();
	
	
	
}
