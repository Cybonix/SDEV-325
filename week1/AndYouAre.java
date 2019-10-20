/**
 * A simple flow control example program.
 * 
 * @author: Mark Orimoloye
 */

import java.util.Scanner;

public class AndYouAre 
{
	public static void main(String[] args) 
	{
    	System.out.println("Hello, and you are?");
    	Scanner in = new Scanner(System.in);
    	String s = in.nextLine();
    	
    	// An example of branching with the If Statement
    	if(s.equals("Mark"))
    	{
    		System.out.println("Hi Mark~!");
    	}
    	else if (s.equals("Matthew")) 
    	{
    		System.out.println("Welcome Professor Brown~!");
    	}
    	else 
    	{
    		System.out.println("Hello, not sure who you are.");
    	}
    	in.close();
	}
}