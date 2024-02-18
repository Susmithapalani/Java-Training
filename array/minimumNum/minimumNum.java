public class minimumNum{
public static void main(String[]args){
int[] numbers={1,2,3,4,5};
int min=numbers[0];
for(int i=1;i<numbers.length;i++){
if(numbers[i]<min){
min=numbers[i];
}
}
System.out.println("Minimum number is: "+min);
}
}