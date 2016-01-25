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
		String input_name = name.next();
		int next_int = integer.nextInt();
		String next_input;
		boolean check = true;
<<<<<<< HEAD
		List <Employee> ofEmployees = new ArrayList <Employee>();
=======
		List ofEmployees = new ArrayList <String>; //These are never used
		List money = new ArrayList <Integer>;
>>>>>>> 45f6c8c0984bea0930b9f141c95e13706e100efe

		System.out.println("Would you like to create an employee?");
		System.out.println("	Yes");
		System.out.println("	No");
		CEO boss = new CEO(7, "Steve Jobs");
		ofEmployees.add(boss);
		next_input = input.next();

		while(next_input.equals("yes") && check == true)
		{
			System.out.println("What is the name of the employee?");
			input_name = input.next();
			System.out.println("What is the entry level of the employee?");
			next_int = integer.nextInt();
<<<<<<< HEAD
			Employee people = new Employee(next_int, input_name);
			ofEmployees.add(people);
=======
			Employee people = new Employee(next_int, input_name); //We create an employee but never use it, and then immediately lose it (wasn't added to the list)

>>>>>>> 45f6c8c0984bea0930b9f141c95e13706e100efe
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
