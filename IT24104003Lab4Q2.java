import java.util.Scanner;
public class IT24104003Lab4Q2   {



public static void main(String[]arges) {
Scanner input=new Scanner(System.in);


//variables
double exammarkes,finalmarkes,labsubmissionmarkes,labpersantage,exampersantage,finallab,totalpersantage,finalexam;


//get marks of exam
System.out.println("ENTER THE EXAM MARKES:");
exammarkes=input.nextDouble();

if (exammarkes>=0&&exammarkes<=100)
   {
System.out.println("EXAM MARKES IS: " + exammarkes);  
   }
else{
   System.out.println("false exam marks");
}

//get mark of lab
System.out.println("ENTER THE LABSUBMISSION MARKES");
labsubmissionmarkes=input.nextDouble();

if (labsubmissionmarkes>=0&&labsubmissionmarkes<=100)
   {
System.out.println("LAB SUBMISSION MARKS IS: "+ labsubmissionmarkes);  
}
else{
System.out.println("IT is false persantage");
}


//get persantage of lab marks

System.out.println("HOW MANY PERSANTAGE LAB MARKS ADDED IN FINAL:");
labpersantage =input.nextDouble();

// get final lab marks 
finallab=(labsubmissionmarkes/100)*labpersantage;
System.out.println("finallabmarkes is"+ finallab);


//get add persantage of exammarkes
System.out.println("HOW MANY PERSANTAGE EXAM MARKS ADDED IN FINAL");
exampersantage=input.nextDouble();

//get final exam markes
totalpersantage=exampersantage+labpersantage;


finalexam=(exammarkes/100)*exampersantage;



//get final total marks




finalmarkes=(finalexam+finallab);

if (totalpersantage==100.00)
{ 
   
System.out.println("THE FINAL MARKES IS:     "+ finalmarkes);
}
else
System.out.println("IT IS WRONG PERSANTAGE");

   }   
}


