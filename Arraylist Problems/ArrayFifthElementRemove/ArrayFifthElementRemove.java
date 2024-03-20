import java.util.ArrayList;
public class ArrayFifthElementRemove{
    public static void main(String[]args){
ArrayList<Integer>arraylist = new ArrayList<>();
arraylist.add(1);
arraylist.add(4);
arraylist.add(7);
arraylist.add(11);
arraylist.add(13);
arraylist.add(15);
arraylist.add(17);
System.out.println("originalist:"+arraylist );
if (arraylist.size()<=13){
    arraylist.remove(4);
    System.out.println("Fifth element removed");

}else {
    System.out.println("Array element doesnt exist");

}
System.out.println("Arraylist after removal:"+ arraylist);


    }
}

