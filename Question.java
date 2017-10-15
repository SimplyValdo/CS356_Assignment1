
public interface Question 
{
	public enum questionType{
        MULTIPLE_CHOICE,
        SINGLE_CHOICE
    }
	
	public int setAnswer(int num);
	public questionType getType();
	public int[] getDatabase();
	
	
}
