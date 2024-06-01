package simplecalculator;
import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) {
		 double num1,num2,result=0;
		 Scanner obj=new Scanner(System.in);
		 System.out.println("*****Basic calculator*****");
		 System.out.println("Enter the firstNumber:");
		 num1=obj.nextDouble();
		 System.out.println("Enter the secondNumber:");
		 num2=obj.nextDouble();
		 System.out.println("choose the operator:");
		 System.out.println("Addition(+)");
		 System.out.println("Substraction(-)");
		 System.out.println("Multiplication(*)");
		 System.out.println("Division(/)");
		 char operator=obj.next().charAt(0);
		 
		 switch(operator)
		 {
		 case('+'):
		     result=num1+num2;
		     break;
		     
		 case('-'):
			 result=num1-num2;
		     break;
		     
		 case('*'):
			result=num1*num2;
		     break;
		     
		 case('/'):
			 if(num2!=0)
				 System.out.println(result=num1/num2);
		         
			 else
				 System.out.println("error:division by zero");
		     
		  break;
		 default:
			 System.out.println("invalid");
			}
      System.out.println(result);
}
}
