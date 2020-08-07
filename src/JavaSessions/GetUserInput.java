package JavaSessions;

import java.util.Scanner;

public class GetUserInput {

	public static void main(String[] args) {

      Scanner obj = new Scanner(System.in);
      System.out.println("Enter Username,Age,salary");
      
      String Username = obj.nextLine();
      
      int age = obj.nextInt();
      double salary = obj.nextDouble();
      
      System.out.println("name is"+Username);
      System.out.println("age is"+age);
      System.out.println("salary is"+salary);
	}

}
