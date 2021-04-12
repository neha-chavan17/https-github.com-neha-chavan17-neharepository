import java.util.*;
class Arm
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String s=a + "" ;
int digit=s.length();
int rem=0,num=0,temp=a;
while(a>0)
{
rem=a%10;
num=num+(int)Math.pow(rem,digit);
a=a/10;

}
if(temp==num)
{
System.out.println("arm");
}
else
System.out.println("no");
}
}