package MyPack;

import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
char choice;
Scanner s=new Scanner(System.in);
System.out.println();
System.out.println("Enter the first number=>");
float a =s.nextInt();
System.out.println("Enter the second number=>");
float b =s.nextInt();
do
{
System.out.println("*****Calculator with simple arithmetic Operations ******");
System.out.print("1.Addition, ");
System.out.print("2.Substraction, ");
System.out.print("3.Multiplication, ");
System.out.print("4.Division, ");
System.out.print("5.Factorial, ");
System.out.print("6.Exit ");
System.out.print("Enter your choice=>");
choice = s.next().charAt(0);
double result=0;
switch(choice)
{
case '1':
result =a+b;
break;
case '2':
result =a-b;
break;
case '3':
result =a*b;
break;
case '4':
if(b==0)
{
System.out.println("Division is not possible!!");
break;
}
else
{
result=a/b;
break;
}
case '5':
int fact=1;
System.out.println("Enter the number for factorial");
int aa = s.nextInt();
for(int i=1;i<=aa;i++)
{
fact=fact*i;
result=fact;
}
break;
case '6':
System.exit(0);
System.out.println("Thank you Executing this program !!!");
break;
default:
System.out.println("Wrong choice Entered!!!");
}
System.out.println("Result is ="+result);
}
while(choice!='6');
}
}
