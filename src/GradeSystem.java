import java.util.Scanner;
public class GradeSystem {

	static Scanner scan = new Scanner(System.in);
	static String input = "";
		
	static int[] scoreArray = new int[5];
	static String[] nameArray = new String[5]; // parallel arrays
	
	static int studentPosition = -1; // for findStudentPosition method
	
	public static void main(String[] args)
	{
		
		System.out.println("\t\t\tStudent Grade System");
		System.out.println("\nThis program will store student grades and look them up for you.");
		System.out.println("\n*********************************");
		System.out.println("Enter the names of 5 students");
		System.out.println("*********************************\n");
		
		GradeSystem.populateNameArray();
		
		System.out.println("\n\n\n*********************************");
		System.out.println("Enter scores. One score per line.");
		System.out.println("*********************************\n");
		
		GradeSystem.populateScoreArray();
		
		System.out.print("\n\n\n\n\nEnter name of student whose score you want to find: ");
		
		input = scan.nextLine();
		GradeSystem.findStudentPosition(input);
		
		if(studentPosition == -1)
		{
			System.out.println("\nI'm sorry. There is no student by that name.\n");
		}
		
		else {
		System.out.printf("%s's score is %d.\n\n", input, scoreArray[studentPosition]);
		}
		
		System.out.print("Press Enter key to exit...");
		scan.nextLine();
		
		scan.close();
		
	} // end main method
		
	public static void populateNameArray() // adds values to the nameArray
	{
		for(int i = 0; i < scoreArray.length; i++) 
		{
			System.out.printf("Enter name %d: ", i+1);
			nameArray[i] = scan.nextLine();
		}
	} // end populateNameArray method
	
	public static void populateScoreArray() // adds values to the scoreArray
	{
		for(int i = 0; i < scoreArray.length; i++) 
		{
			System.out.printf("Enter score for %s: ", nameArray[i]);
			scoreArray[i] = Integer.parseInt(scan.nextLine());
		}
	} // end populateScoreArray method
	
	public static int findStudentPosition(String nameOfStudent) // finds the index of the entered student name (input)
	{
		for(int i = 0; i < nameArray.length; i++)
		{
			if(nameOfStudent.equals(nameArray[i])) {
				studentPosition = i;
			}
		}
				
		return studentPosition;
	} // end findStudentPosition method

} // end class