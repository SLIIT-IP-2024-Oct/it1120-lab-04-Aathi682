import java.util.Scanner;

public class IT24104003Lab4Q1{

 public static void main(String[] arges) {

Scanner ab=new Scanner(System.in);

System.out.print("Enter the number");
int number= ab.nextInt();

if (number>0){
System.out.println("Possitive");
} else if (number<0){
System.out.println("Negative");
} else{
System.out.println("Zero");
}
ab.close();
   }
}
