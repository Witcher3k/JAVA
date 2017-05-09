import java.io.*;
import java.util.Scanner;

/**
 * Created by k-mil on 2017-05-09.
 */
public class Program {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("proba.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        Scanner sc = new Scanner(System.in);

        String tekst="czesc";

        try {

            bw.write(tekst);
            bw.newLine();
            do{
                System.out.println("slowo koniec konczy wpisywanie");
                tekst=sc.nextLine();
                bw.write(tekst);
                bw.newLine();
            }while (!tekst.equals("koniec"));
        }
        finally {
            bw.close();
        }

        FileReader fr = new FileReader("proba.txt");
        BufferedReader br = new BufferedReader(fr);
        String odczyt="";
        try {
            do {
                System.out.println(odczyt);
                odczyt = br.readLine();
            }
            while (odczyt!=null);
        }
        finally {
            br.close();
        }



    }
}
