package Loops;
import java.util.Scanner;

/*for(int i=1; i<=10; i++) {
if(i==5) {
	break;
}
System.out.println(i + "Loop breaked..! at number : 5");
}
for(int i=1; i<=10; i++) {
if(i==5) {
	continue;
}
System.out.println(i +"Loops has been continued to to re-iterate on number 5");
}*/

public class FlowControlOfLoops {

	public static void main(String[] args) {
		// Break and Continue keywords
		//Making use of both the loops 1.for 2.while
		Double number,sum=0.0;
		//Creating a object for scanner class
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a number: ");
			//input from the user
			number=input.nextDouble();
			//if number is negative the loop terminates
			if(number <0.0) {
				break;
			}
			sum+=number;
		}
		System.out.println("sum = "+ sum);
		input.close();
	}
}
