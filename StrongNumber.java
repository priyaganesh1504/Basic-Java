import java.util.*;
import java.util.Scanner;
public class StrongNumber {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int temp,remainder,sum=0,factorial,i;
		temp=number;
		while(temp>0) {
			factorial=1;
			i=1;
			remainder=temp%10;
			while(i<=remainder) {
				factorial=factorial*i;
				i++;
			}
			sum=sum+factorial;
			temp=temp/10;
		}
		System.out.println(sum);
	
	if(number==sum) 
		System.out.println("the number is Strong");
	else
		System.out.println("The number is not Strong");
	}
}
