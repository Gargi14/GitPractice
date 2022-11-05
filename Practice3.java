public class Practice3

public static void main(String[] Args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter Age");
int age=sc.nextInt();

if(age>18)
{
	System.out.println("You are eligible for Voting");	
}
else if(age=18)
{
	
	System.out.println("You are eligible for Voting");	
}

else
{
	System.out.println("You are not eligible for voting Try After )"+(18-Age)+"( years)";
}

}