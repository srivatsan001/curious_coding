/*Prob 4: Write a program using switch case which takes a value and prints the respective Size.
If size is 29 then its small */

import java.util.*;
import java.util.Scanner; 

public class program4 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    switch(size)
    {
        case 29:
            System.out.println("Samll");
            break;
        case 30:
            System.out.println("medium");
            break;
        case 38:
            System.out.println("Large");
            break;
        case 42:
            System.out.println("XLarge");
            break;
        default:
            System.out.println("Invalid");
            break;
            

    }
}
}
