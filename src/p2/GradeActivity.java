package p2;

public class GradeActivity {
 private double score;

 public void setScore(double score) {
     this.score = score;
 }

 public double getScore() {
     return score;
 }

 public char getGrade() {
     if (score >= 80) return 'A';
     else if (score >= 65) return 'B';
     else if (score >= 50) return 'C';
     else if (score >= 40) return 'D';
     else return 'F';
 }
}