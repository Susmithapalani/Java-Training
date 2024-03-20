import java.util.ArrayList;
public class MaxMinArraylist{
    public static void main(String[]args){
        ArrayList<Integer>number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(5);


int max = Integer.MIN_VALUE; 
int min = Integer.MAX_VALUE; 
for (int num : number) {
 if (num > max) 
max = num;
if (num < min) 
min = num;
        }
System.out.println("Min Value:"+min);
System.out.println("Max Value:"+max);
    }
}