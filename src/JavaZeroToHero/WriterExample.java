package JavaZeroToHero;
import java.io.*;

public class WriterExample {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("C:\\Users\\Kanchana Umesha\\Desktop\\WriterTest.txt");
            String content = "Fuck off";
            writer.write(content);
            writer.close();
            System.out.println("Done");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
