import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle_1 = sc.nextInt();
        int angle_2 = sc.nextInt();
        int angle_3 = sc.nextInt();
        int totalAngle = angle_1+angle_2+angle_3;
        if (totalAngle == 180){
            System.out.println("Tringle can be formed");
        }
        else{
            System.out.println("Tringle cannot be formed");
        }
        
        
       
    }
}