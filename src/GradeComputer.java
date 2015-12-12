import java.awt.Component;
import javax.swing.*;
/**
 * 
 * @author Isaac M. Rys
 * @version 12/02/15
 * A program that computes a student's Grade Point Average (GPA). 
 * 
 */

public class GradeComputer {
	/**
     * Creates the JOptionPane dialogs for the user input and the program output
     */
private static Component frame;
public static void main(String[] args) {
	int numCourses;
	double totalQuality = 0.0;
	double allCredits = 0.0;
	double gpa = 0.0;
	String end = "st";
	JOptionPane.showMessageDialog(null,"This program will ask you questions."
			+ "\nThe questions are: "
			+ "\nHow many courses are you taking?"
			+ "\nHow many credits are each of the courses?"
			+ "\nWhat is your grade for each course?"
			+ "\n The program will output your GPA");
	 
	numCourses = Integer.parseInt(JOptionPane.showInputDialog(
			"Enter the number of courses you taking"));
	
	double [] credits = new double[numCourses];
	for(int i = 0; i < numCourses; i++){
		if(i == 1){
			end = "nd";
		}
		
		else if(i == 2){
			end = "rd";
		}
		
		else if(i>2){
			end = "th";
		}
		
		credits[i] = Double.parseDouble(JOptionPane.showInputDialog(
				"How many credits does your " + (i+1) + end + " course have?")); 
	}
	
	String[] grades= new String[numCourses];
	for(int i = 0; i < numCourses; i++){
		grades[i] = JOptionPane.showInputDialog("What is your grade for "
				+ "course number " + (i+1));{	
		}
	}
	for(int i = 0; i < numCourses; i++){
		totalQuality += computeQualityPoints(grades[i]) * credits[i];
		allCredits += credits[i];
	}
	gpa = totalQuality / allCredits;
	JOptionPane.showMessageDialog(frame,"Your GPA is: " + gpa); 
}

/**
 * This method takes a letter and matches it to a grade (4.0 scale)
 * @param grade
 * @return grades
 */
public static double computeQualityPoints(String grade){
	double grades = 0;
	if(grade.equals("A")){
		grades = 4.0;
	}
		
	else if(grade.equals("A-")){
		grades = 3.7;  
	}

	else if(grade.equals("B+")){
		grades = 3.3;
	}

	else if(grade.equals("B")){
		grades = 3.0;
	}
		
	else if(grade.equals("B-")){
		grades = 2.7;
	}
	
	else if(grade.equals("C+")){
		grades = 2.3;
	}
	
	else if(grade.equals("C")){
		grades = 2.0;
	}
	
	else if(grade.equals("C-")){
		grades = 1.7;
	}
	
	else if(grade.equals("D+")){
		grades = 1.3; 
	}
	
	else if(grade.equals("D")){
		grades = 1.0;
	}
	
	else if(grade.equals("D-")){
		grades =  0.7;
	}
	
	else if(grade.equals("F")){
		grades = 0.0 ;	
	}
		return grades;
	}
}

