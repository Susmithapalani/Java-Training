import java.io.File;
public class FileHandling{
    public static void main (String[]args){
        File file = new File("C:\\Users\\ELCOT\\Desktop\\susmitha\\Java Training\\Filehandling\\Test.txt");
try{
    if (file.exists()){
        file.delete();
    }
    file.createNewFile();
}catch(Exception e){
    System.out.println("File creation error"+e.getMessage());

}
    }
}