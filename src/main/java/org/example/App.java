package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ask for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter a noun: " );
        String noun = scanner.nextLine();
        System.out.print( "Enter a verb: " );
        String verb = scanner.nextLine();
        System.out.print( "Enter an adjective: " );
        String adj = scanner.nextLine();
        System.out.print( "Enter an adverb: " );
        String adverb = scanner.nextLine();
        //final output
        System.out.print( "Did you "+verb+ " with your "+adj+ " "+noun+ " " +adverb+ "? That sounds so fun!");

    }
}
