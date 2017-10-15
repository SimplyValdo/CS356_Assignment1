import java.util.Random;

public class SimulationDriver 
{
	
	public static void main(String[] args){
		
		Random rand = new Random();
		
		//Randomize number of students & Question Type
		int numberOfStudents = rand.nextInt(55);
		Question.questionType type = Question.questionType.values()[rand.nextInt(2)];
		
		System.out.println("Welcome to CS356 IVOTESERVICE");
		System.out.println("Number of Students: " + numberOfStudents);
		
		//Create student database and IVoteService
		Student studentDatabase[] = new Student[numberOfStudents];
		IVoteService session;
		Question question;
		
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
		
		for(int each = 0; each < numberOfStudents; each++){
		
			studentDatabase[each] = new Student(Integer.toString(each));
			
			if(type == Question.questionType.MULTIPLE_CHOICE){

				int currentAnswer = rand.nextInt(4);
				studentDatabase[each].setAnswer(currentAnswer);
				session.acceptAllSubmissions(currentAnswer);
			}
			else{
				int currentAnswer = rand.nextInt(2);
				studentDatabase[each].setAnswer(currentAnswer);
				session.acceptAllSubmissions(currentAnswer);
			}
		}
		
		session.displayAllSubmissions();
	}
}
