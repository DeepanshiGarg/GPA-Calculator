package Project;
import java.util.*;
public class GPA_calculation {

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
			String name[]= new String[n]; 
			int [] creditHours = {4, 5, 4, 3, 2, 4};
					for(int i =0; i<n; i++)
					{
						System.out.println("Enter the name of the " + (i+1) + " student");
						name[i]= input.nextLine();
						
					}
					String [] subjects = {"Math", "Science","Language", "Drama", "Music", "Biology"};
					String [] schools = {"School of Engineering", " School of Business", "Law School", "Not accepted"};
					int row = name.length;
					int column = subjects.length;
					double [][] grades = new double [row][column];
					for(int l=0;l<name.length;l++)
					{
					for (int k = l; k <= l; k++)
					{
					for (int m = 0; m <column; m++) 
					{
					System.out.println("Input " +name[l]+ "'s mark in "+ subjects[m] + " Credit hours ="+ creditHours[m]);
					grades[k][m] = input.nextDouble();
					}
					}
					}
					
					double GPA[] = new double[n];
					double individual_GPA =0;
					double total_marks[] =new double[n];
						for(int b = 0; b<row ; b++)
						{
							for(int c = 0; c<column ;c++)
							{
								total_marks[b] = total_marks[b] + grades[b][c]*creditHours[c];
							}
						}
						for(int i = 0; i<total_marks.length;i++)
						{
						 System.out.println("Total Marks "+total_marks[i]);	
						}
						for(int i=0; i<GPA.length;i++)
						{
							for(int j =0; j<=i;j++)
							{
								GPA[i]= total_marks[j]/22;
							}
							//GPA[i]= individual_GPA;
							System.out.println("GPA for " +(i+1)+ " student " +GPA[i]);
							//individual_GPA=0;
						}
						int engineering_count =0, business_count =0, law_count =0, not_accepted_count =0;
						for(int i =0; i<GPA.length;i++)
						{
							if(GPA[i]>= 90 && GPA[i]<=100)
								engineering_count++;
							else 
								if(GPA[i]>= 80 && GPA[i]<90)
									business_count++;
								else
									if(GPA[i]>= 70 && GPA[i]<80)
										law_count++;
									else
										not_accepted_count++;
						}
						System.out.println("Number of students in School of Engineering = " +engineering_count);
						System.out.println("Number of students in School of Business = " +business_count);
						System.out.println("Number of students in Law School = " +law_count);
						System.out.println("Number of students Not Accepted = " +not_accepted_count);
					
						
					
	}
	

}