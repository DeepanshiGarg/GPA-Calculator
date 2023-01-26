package Project;

import java.util.*;
public class Student_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					System.out.println("Invalid Number; Try again");
				}
			else if(count_students == 3)
				System.out.println("Number of students incorrectly entered three times");
		}
		

	}
	public static void Student_info(int n)
	{
		Scanner input = new Scanner(System.in);	
		int count = 0;
			String name[]= new String[n];
			int marks[] = new int[6*n]; 
					for(int i =0; i<n; i++)
					{
						System.out.println("Enter the name of the " + (i+1) + " student");
						name[i]= input.nextLine();
						for(int k =i; k<= i+1;k =k+6)
						{
							System.out.println("Input your mark in Math");
							marks[k]=input.nextInt();
							System.out.println("Input your mark in Science");
							marks[k+1]=input.nextInt();
							System.out.println("Input your mark in Language");
							marks[k+2]=input.nextInt();
							System.out.println("Input your mark in Drama");
							marks[k+3]=input.nextInt();
							System.out.println("Input your mark in Music");
							marks[k+4]=input.nextInt();
							System.out.println("Input your mark in Biology");
							marks[k+5]=input.nextInt();
							
						}
						
					}
	}

}
