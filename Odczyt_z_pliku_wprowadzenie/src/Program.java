import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * Created by k-mil on 2017-05-09.
 */
public class Program {
    public static void main(String[] args) throws FileNotFoundException {


        File f = new File("proba.txt");
        Scanner sc = new Scanner(f);

        String zdanie = sc.nextLine();
        System.out.println(zdanie);

        PrintWriter zapis = new PrintWriter("proba.txt");
        zapis.printf("tu brzoza tu brzoza");
        zapis.close();


        System.out.println("odczyt po zapisie: "+zdanie);


        FileReader fr = new FileReader("proba.txt");
        try {
            int znak = fr.read();
            System.out.println((char)znak);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(fr);
        try {
            br.read();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
