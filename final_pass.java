package Project;

import java.util.Scanner;

public class final_pass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i =0 ;i<3;i++)
		{
			count++;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the password");
			String password = input.nextLine();
			if(checkPassword(password)==true)
				System.out.println("Valid Password");
			else
			{
				System.out.println("Invalid Password, try again");
				if(count == 3)
					System.out.println("Password incorrectly entered three times");
			}		
			
		}

	}
	public static boolean checkPassword(String str)
	{
		boolean result = false;
		int length =0;
		length = str.length();
		int digit_count = 0, upper_count = 0, letter_count = 0, special_count =0;
			if(length>=10)
			{
				for(int i =0;i<length;i++)
				{
					if(Character.isDigit(str.charAt(i)))
						digit_count++;
						else if(Character.isUpperCase(str.charAt(i)))
								upper_count ++;
						else if(Character.isLetter(str.charAt(i)))
								letter_count++;
								else
									special_count++;
				}
				if(digit_count ==2 || digit_count == 3 && upper_count>0 && special_count == 1)
				{
					result = true;
				}
				}
			else
				result = false;
	return result;
	
	}
}


