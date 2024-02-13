package magnoliafresh;

import java.util.Scanner;


public class Magnoliafresh {  
    
    static Scanner InputString = new Scanner(System.in);
    static Scanner InputInteger = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print( "Enter Full Name: ");
        String name = InputString.nextLine();
        System.out.println("Your full name is " + name);
        System.out.print( "Enter Age: ");
        int age = InputInteger.nextInt();
        System.out.println("You are " + age);
        System.out.print("Enter Gender: ");
        String Sex = InputString.nextLine();
        System.out.println("Your Gender is " + Sex);
        System.out.print("Enter Address: ");
        String loc = InputString.nextLine();
        System.out.println("You live in: " + loc);
        System.out.print( "No. of Brothers/Sisters: ");
        int sis = InputString.nextInt();
        System.out.println("Total sibling is: " + sis);
        
    }
}
    
    

