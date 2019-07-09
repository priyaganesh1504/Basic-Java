import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int radius=scan.nextInt();
        double area;
        
        area=(22*radius*radius)/7;
        System.out.println(area);
    }
}
