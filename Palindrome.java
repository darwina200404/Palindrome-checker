import java.util.Scanner;
public class Palindrome{
public static void main(String args[]){
String original,reverse="";
Scanner sc= new Scanner(System.in);
System.out.println("enter number / string ");
original =sc.nextLine();
int length=original.length();
for(int i =length-1;i>=0;i--){
reverse=reverse+original.charAt(i);
}
if(original.equals(reverse)){
System.out.println("Pallindrome");
}
else{
System.out.println("not Pallindrome");
}
}
}