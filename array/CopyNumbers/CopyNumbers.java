public class CopyNumbers{
public static void main(String[]args){
int[] numbers={1,2,3,4,5};
int[] copyNumbers=new int[numbers.length];
for(int i=0;i<numbers.length;i++){
copyNumbers[i]=numbers[i];
}
System.out.println("Elements of numbers: "); 
for(int i=0;i<numbers.length;i++){
System.out.println(numbers[i]+"");
}
System.out.println();
System.out.println("Elements of CopyNumbers: "); 
for(int i=0;i<copyNumbers.length;i++){
System.out.println(copyNumbers[i]+"");
}
}
}
