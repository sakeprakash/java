import java.util.Scanner;
public class Calculator{
  public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number:");
    double num1=sc.nextDouble();
    double num2=sc.nextDouble();
    System.out.print("Enter the operator(+,-,*,/):");
    char operator=sc.next().charAt(0);
    double result;
    switch(operator){
        case '+':
        result=num1+num2;
        break;
        case'-':
        result=num1-num2;
        break;
        case'*':
        result= num1*num2;
        break;
        case'/':
        if(num2!=0)
          result= num1/num2;
        else{
          System.out.println("Error: Division by Zero is not allowed ");
        return;
          }
        break;
        default:
        System.out.println("Invalid Operator");
        return;
        }
        System.out.println("Result:"+result);
    }
  }