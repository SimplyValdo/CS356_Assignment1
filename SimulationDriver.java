import java.util.Random;

public class SimulationDriver 
{
	public static void main(String[] args){
		
		Random rand = new Random();
		
		//Randomize number of students & Question Type
		int numberOfSubmissions = rand.nextInt(56);
		Question.questionType type = Question.questionType.values()[rand.nextInt(2)];
			
		//Create IVoteService & Question instances
		IVoteService session;
		Question question;
		
		//Welcoming Message
		System.out.println("\"Welcome to CS356 IVOTESERVICE\"\n");
		
		//Instantiate a question object depending on type
		if(type == Question.questionType.MULTIPLE_CHOICE){
			question = new multipleChoice();
			session = new IVoteService(question);
			
			System.out.println("Question Type: MULTIPLE CHOICE");
		}
		else{
			question = new singleChoice();
			session = new IVoteService(question);
			
			System.out.println("Question Type: SINGLE CHOICE");
		}
		
		//Iterate through all the submissions 
		for(int each = 0; each < numberOfSubmissions; each++){
		
			//Randomize a student ID (Possible duplicates)
			int randomStudentID = rand.nextInt(25);
			
			//Depending on question type, select an answer for current studentID
			if(type == Question.questionType.MULTIPLE_CHOICE){

				//Multiple choice answer
				int currentAnswer = rand.nextInt(4);
				session.submit(new Student(randomStudentID+"", currentAnswer));
			}
			else{
				
				//Single choice answer
				int currentAnswer = rand.nextInt(2);
				session.submit(new Student(randomStudentID+"", currentAnswer));
			}
		}
		
		//Display output
		System.out.println("Number of Submissions: " + numberOfSubmissions);
		System.out.println("Number of Students: " + session.getNumberOfUniqueStudents());
		session.displayAllSubmissions();
		
	}
}
