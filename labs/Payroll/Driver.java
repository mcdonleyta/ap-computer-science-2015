import Class.*;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Driver
{
	public static void main(String[] args)
	{
		Scanner name = new Scanner(System.in);
		Scanner integer = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		String input_name = name.nextLine();
		int next_int = integer.nextInt();
		String next_input;
		boolean check = true;
		List ofEmployees = new ArrayList <String>;
		List money = new ArrayList <Integer>;

		System.out.println("Would you like to create an employee?");
		System.out.println("	Yes");
		System.out.println("	No");
		
		next_input = input.nextLine();

		while(next_input.equals("yes") && check == true)
		{
			CEO boss = new CEO(7, "Steve Jobs");
			System.out.println("What is the name of the employee?");
			input_name = input.nextLine();
			//People object = new People(input_name);
			System.out.println("What is the entry level of the employee?");
			next_int = integer.nextInt();
			Employee people = new Employee(next_int, input_name);

			System.out.println("Would you like to add another?");
			input_name.nextLine();
			if(next_input.equals("yes"))
			{
				System.out.println("Creating another one...");
				check = true;
			}else
			if(next_input.equals("no"))
			{
				System.out.println("Goodbye");
				check = false;
			}

		}
	}
}