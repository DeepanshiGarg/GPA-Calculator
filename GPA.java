package Project;
import java.util.*;
public class GPA {

	public static void main(String[] args) {
		System.out.println("Welcome to Humber College");
		boolean condition = true;
		while (condition = true){
			int count = 0;
			for(int i = 0 ; i < 3; i++)
			{
				count++;
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the password");
				String password = input.nextLine();
				if(checkPassword(password)==true)
				{
					System.out.println("Valid Password");
					break;
				}
				else if(count<3)
				{
					System.out.println("Invalid Password, try again");
				}
				else
				{
					System.out.println("Password incorrectly entered three times");
					System.out.println("TERMINATING PROGRAM!");
					condition = false;
				}
			}
			if (condition == false)
			{
				break;
			}	
			int count_students =0;
			for(int k = 0; k <3;k++)
			{
				count_students++;
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the number of Students");
				System.out.println("Number of entered students should be between 1 to 50");
				int student_count = input.nextInt();
				if(student_count >=1 && student_count <=50)
				{
					Student_info(student_count);
					break;
				}
				else
					if(count_students<3)
					{
						System.out.println("Invalid Number: Try again");
					}
					else
					{
						System.out.println("Number of students incorrectly entered three times");
						System.out.println("TERMINATING PROGRAM!");
						condition = false;
					}
				input.close();
			}
			break;
		}
	}
	public static boolean checkPassword(String password)
	{
		if (password.length() < 10) {
			return false;
		}
		int upcase = 0, nums = 0, spchars = 0;
		String spcharsString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				upcase++;
			}
			if (Character.isDigit(password.charAt(i))) {
				nums++;
			}
			if (spcharsString.contains(Character.toString(password.charAt(i)))){
				spchars++;
			}
		}
		if (upcase < 1 || nums != 2 && nums != 3 || spchars != 1) {
			return false;
		}
		else {
			return true;
		}
	}

	public static void Student_info(int n)
	{
		Scanner input = new Scanner(System.in);	
		String[] name= new String[n]; 
		int [] creditHours = {4, 5, 4, 3, 2, 4};
		for(int i =0; i<n; i++)
		{
			System.out.println("Enter the name of the " + (i+1) + " student");
			name[i]= input.nextLine();
						
		}
		String [] subjects = {"Math", "Science","Language", "Drama", "Music", "Biology"};
		int row = name.length;
		int column = subjects.length;
		double [][] grades = new double [row][column];
		for(int l=0;l<grades.length;l++)
		{
			for (int k = l; k <= l; k++)
			{
				for (int m = 0; m < column; m++) 
				{
					System.out.println("Input " +name[l]+ "'s mark in "+ subjects[m]);
					grades[k][m] = input.nextDouble();
				}
			}
		}
		input.close();	
		double GPA[] = new double[n];
		double total_marks[] =new double[n];
		for(int b = 0; b<row ; b++)
		{
			for(int c = 0; c<column ;c++)
			{
				total_marks[b] = total_marks[b] + grades[b][c]*creditHours[c];
			}
		}
						
		for(int i=0; i<GPA.length;i++)
		{
			for(int j =0; j<=i;j++)
			{
				GPA[i]= total_marks[j]/22;
			}
							//System.out.println("GPA for " +(i+1)+ " student " +GPA[i]);
		}
		int engineering_count =0, business_count =0, law_count =0, not_accepted_count =0;
		String[] college = new String[n];
		for(int i =0; i<GPA.length;i++)
		{
			if(GPA[i]>= 90 && GPA[i]<=100)
			{
				engineering_count++;
				college[i]= "School of Engineering";
			}
			else if(GPA[i]>= 80 && GPA[i]<90)
			{
				business_count++;
				college[i]= "School of Business";
			}
							
			else if(GPA[i]>= 70 && GPA[i]<80)
			{
				law_count++;
				college[i]= "Law School";
			}
			else
			{
				not_accepted_count++;
				college[i]= "Not accepted";
			}
		}
		int total_accepted_students = engineering_count + business_count + law_count;
		System.out.println("Report 1");
		for(int t =0; t<name.length;t++)
		{
			System.out.println("Student name: "+name[t]+ "; College name: "+college[t]);
		}
		System.out.println();
		System.out.println("Report 2");
		System.out.println("Total students accepted in Humber College: "+total_accepted_students);
		System.out.println("	Number of students in School of Engineering = " +engineering_count);
		System.out.println("	Number of students in School of Business = " +business_count);
		System.out.println("	Number of students in Law School = " +law_count);
		System.out.println();
		System.out.println("Report 3");
		System.out.println("	Number of students Not Accepted = " +not_accepted_count);
		System.out.println();
		System.out.println("Report 4");
		for(int i = 0; i<total_marks.length;i++)
			{
			 System.out.println("	Total Marks for "+name[i]+ " are: "+total_marks[i]);	
			}
		for(int i=0; i<GPA.length;i++)
		{
			for(int j =0; j<=i;j++)
			{
				GPA[i]= total_marks[j]/22;
			}
							System.out.println("	GPA for "+ name[i]+ " is: " +GPA[i]);
		}
						
					
	}

}

