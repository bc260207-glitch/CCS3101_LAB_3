package p2;

public class Essay extends GradeActivity {
 private double grammar;
 private double spelling;
 private double length;
 private double content;

 public Essay(double grammar, double spelling, double length, double content) {
     this.grammar = grammar;
     this.spelling = spelling;
     this.length = length;
     this.content = content;
     
     setScore(grammar + spelling + length + content);
     
 }
 
 public double getScoreSpelling() {
     return spelling;
 }

}