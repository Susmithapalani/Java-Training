public class Pattern6{
public static void main(String args[]){
int n=5;
for(int r=1;r<=n;r++){
System.out.print("* ");
for(int c=1;c<n-1;c++){
if(r==(n/2)+1){
System.out.print("* ");
}
else{
System.out.print("  ");
}
}
for(int c=5;c>=n;c--){
System.out.print("*");
}
System.out.println("");
}
}
}