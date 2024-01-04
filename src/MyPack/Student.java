package MyPack;

import java.util.Scanner;
class Student {
 int rollno;
 private String studentName;
 void getNumber(int n) {
 this.rollno = n;
 }
 public void getStudentName(String studentName) {
 this.studentName = studentName;
 }
 public void printStudent() {
 System.out.println("Student Roll no: " + rollno);
 System.out.println("Student Name: " + studentName);
 }
}
class test extends Student {
 int insem,endsem;
 public void getMarks(int m1, int m2) {
 this.insem = m1;
 this.endsem = m2;
 }
 public void putMarks() {
 System.out.println("Marks Obtained:");
 System.out.println("InSem Marks: " + insem);
 System.out.println("EmdSem Marks: " + endsem);
 }
}
interface sports
{
 int sportswt=5;
 void putWt();
}
class results extends test implements sports
{
 int total;
 @Override
 public void putWt() {
 System.out.println("Sports marks="+sportswt);
 }
public void display()
{
total=insem+endsem+sportswt;
if(total>100)total=100;
printStudent();
putMarks();
putWt();
System.out.println("Total Score: "+total);
}
}
class interf2 {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 results r1= new results();
 System.out.println("Enter students name:");
 String studentName=sc.next();
 r1.getStudentName(studentName);
 System.out.println("Enter students roll no:");
 int rollno=sc.nextInt();
 r1.getNumber(rollno);
 System.out.println("Enter students insem marks:");
 int inMarks=sc.nextInt();
 System.out.println("Enter students endsem marks:");
 int endMarks=sc.nextInt();
 r1.getMarks(inMarks, endMarks);
 r1.display();
 }
}
