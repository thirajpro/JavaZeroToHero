package JavaZeroToHero;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;


public class BufferRead {
    public static void main(String[] args) throws Exception {
        FileReader filereader = new FileReader("C:\\Users\\Kanchana Umesha\\Desktop\\TestText.txt");
        BufferedReader buff = new BufferedReader(filereader);

        int i;
        while((i=buff.read())!=-1){
            System.out.print((char)i);
        }

        filereader.close();
        buff.close();
        System.out.println();
        String input = String.valueOf(buff.read());
        String[] digits = input.split("");
        System.out.println(Arrays.toString(digits));

    }
}
