package p2;

public class TestEssay {
 public static void main(String[] args) {
	 
     Essay essay = new Essay(25, 18, 15, 28);
     System.out.println("Score: " + essay.getScore() + ", Grade: " + essay.getGrade());

     GradeActivity activity = essay;
     System.out.println("Score: " + activity.getScore() + ", Grade: " + activity.getGrade());
     
     // below for test
     System.out.println("\n//BELOW FOR TEST");
     
     System.out.println(essay.getScoreSpelling());     
     //System.out.println(activity.getScoreSpelling());  --not work
 }
}