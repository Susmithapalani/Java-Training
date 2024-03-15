import java.util.Scanner;
public class ArmstrongNumber
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
	    int num = s.nextInt();
        int temp = num;
        int sum = 0;
        while (temp != 0) 
		{int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        
		}if (num == sum){
		    System.out.println("armstrong number");
		}else{
		    System.out.println("Not a armstrong number");
		}
		
		
		
		
		
	}
}
