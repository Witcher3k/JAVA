import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by k-mil on 2017-05-09.
 */
public class Program {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("plik.txt");
        BufferedReader br = new BufferedReader(fr);

        try {
            String tekst = br.readLine();
            do {
                System.out.println(tekst);


                tekst = br.readLine();
            }
            while (tekst!=null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            br.close();
        }


    }
}
