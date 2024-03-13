class PrintNumbers extends Threads{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
    }
}
public class MultiThreadEx{
    public static void main (String[]args){
    for(int i=0;i<3;i++){
        PrintNumbers obj1 = new PrintNumbers(i);
        obj1.start();
    }
    }
}