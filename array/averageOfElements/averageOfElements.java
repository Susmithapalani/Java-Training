public class averageOfElements{
public static void main(String[]args){
int[] numbers={1,2,3,4,5};
int arrayLength=numbers.length;
int Total=0;
for(int i=0;i<numbers.length;i++){
Total=Total+numbers[i];
}
System.out.println("Average Of AN Element:"+Total/numbers.length);
}
}