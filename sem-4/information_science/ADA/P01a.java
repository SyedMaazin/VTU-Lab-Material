/*
1) a) Create a Java class called Student with the following details as variables within it.
(i) USN
(ii) Name
(iii) Branch
(iv) Phone 
Write a Java program to create n Student objects
and print the USN, Name, Branch, and Phone of these objects with suitable headings.
*/

/*File name has to be Student */
import java.util.Scanner;

class Student{
    String usn;
    String name;
    String branch;
    long phone;
    Scanner sc=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter usn");
        usn=sc.next();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter branch");
        branch=sc.next();
        System.out.println("Enter phone number");
        phone=sc.nextLong();
    }
    void display()
    {
        System.out.println(usn+"\t"+name+"\t"+branch+"\t"+phone);
    }
    public static void main( String args[])
    {
         Student s[]=new Student[100];
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) 
        {
            s[i]=new Student();
            s[i].read();
        }
        System.out.println("\nUSN\tName\tBanch\tPhone number");
       for (int i=0;i<n;i++) s[i].display();
    }

}
