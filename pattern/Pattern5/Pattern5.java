public class Pattern5{
public static void main(String args[]){
int n=4;
for(int r = 1; r <= n ; r++) 
{
System.out.print("* ");
for(int c = 1; c<=n-1; c++)
{
if(r == n )
System.out.print("* ");
else
System.out.print(" ");
}
System.out.println("");
}
}
}