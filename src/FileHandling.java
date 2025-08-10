import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args){
        try{
            File myfile = new File("FileTesting.txt");
            if (myfile.exists()){
                System.out.println("File exist");
            }
            else{
                myfile.createNewFile();
                System.out.println("File Created");
            }
            FileWriter writer = new FileWriter("FileTesting.txt");
            writer.write("welcome to file");
            writer.append("java");
            writer.close();

            FileReader reader = new FileReader("FileTesting.txt");
            Scanner obj = new Scanner(reader);
            while(obj.hasNext()){
                System.out.println(obj.nextLine());
            }
            if (myfile.delete()){
                System.out.println("Deleted");
            }
            else {
                System.out.println("Error");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
