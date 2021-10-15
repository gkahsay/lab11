package Exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WriteOutput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            int num =scanner.nextInt();
            if(num !=0){
                throw new Exception("Not zero");
            }
            System.out.println("I'm happay with the input.");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Entry");
        }
        catch (Exception e){

            System.out.println("Error:"+ e.getMessage());
        }
        finally {
            System.out.println("Finally Clause Executed");
        }

        /**
         *
         if (a)-1, Output will be; Error: Not zero
                                   Finally Clause Executed
         if (b) 0, output will be: I am happy with the input.
                                    Finally Clause Executed
         if(c) 12XY Output will be: Invalid Entry because 12XY is String
                                    Finally Clause Executed
         */
    }
}
