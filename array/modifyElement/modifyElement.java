public class modifyElement{
public static void main(String[]args){
int[] numbers={1,2,3,4,5};
for(int i=0;i<5;i++){
System.out.println("Original Value:"+numbers[i]);
}
numbers[1]=10;
System.out.println();
for(int i=0;i<5;i++){
System.out.println("Modified Value:"+numbers[i]);
}
}
}