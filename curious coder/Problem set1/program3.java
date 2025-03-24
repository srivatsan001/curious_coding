/*Prob 3: Given mark of student, Print the Grade*/

import java.util.Scanner;

public class program3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if(mark>=90){
            System.out.println("Grade A");
        }
        else if(mark>=80){
            System.out.println("Grade B");
        }
        else if(mark>=60){
            System.out.println("Grade C");

        }
        else if (mark >=35) {
            System.out.println("Grade D");
            
        } else {
            System.out.println("Fail");
            
        }

        

    }
    
}
