import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int functionality, design, teamwork, efficiency, readable, quality, score;
		int percentage;
		Scanner inputNumScanner = new Scanner(System.in);
	
		System.out.println("Enter the Functionality score (max 50): ");
		functionality = inputNumScanner.nextInt();
		
		System.out.println("Enter the Design score (max 10): ");
		design = inputNumScanner.nextInt();
		
		System.out.println("Enter the Teamwork score (max 20): ");
		teamwork = inputNumScanner.nextInt();
		
		System.out.println("Enter the Efficiency score (max 5): ");
		efficiency = inputNumScanner.nextInt();
		
		System.out.println("Enter the Readable score (max 5): ");
		readable = inputNumScanner.nextInt();
		
		System.out.println("Enter the Quality score (max 10): ");
		quality = inputNumScanner.nextInt();
		
		if (functionality > 50 || design > 10 || teamwork > 20 ||
				efficiency > 5 || readable > 5 || quality > 10){
			System.out.println("Error 147R: One or more areas have been scored above the max expected.");
		}
		else{
			score = functionality + design + teamwork + efficiency + readable + quality;
			percentage = score*100 / 100 ;
			
			 if (score <= 100 && score >= 90 ){
				 System.out.println("You got a " + percentage + "% A.");
			 }
			 
			 else if (score <= 89 && score >= 80){
				 System.out.println("You got a " + percentage + "% B.");
			 }
			 
			 else if (score <= 79 && score >= 70){
				 System.out.println("You got a " + percentage + "% C.");
			 }
			 
			 else if (score <= 69 && score >= 60){
				 System.out.println("You got a " + percentage + "% D.");
			 }
			 else{
				 System.out.println("You got a " + percentage + "% F.");
			 }
			 
		}
	}

}
