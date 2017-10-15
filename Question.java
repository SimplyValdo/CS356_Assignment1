
public interface Question 
{
	public enum questionType{
        MULTIPLE_CHOICE,
        SINGLE_CHOICE
    }
	
	public int setRandomAnswer(int num);
	public questionType getType();
	
}
