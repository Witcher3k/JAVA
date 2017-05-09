import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by k-mil on 2017-05-09.
 */
public class Program {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("plik.txt");
        BufferedReader br = new BufferedReader(fr);
        int znaki=0;
        int bialeznaki=-1;
        int ileslow=0;
        String trim;

         try {
             String tekst=br.readLine();
             do {
                 for (int i = 0; i <tekst.length() ; i++) {
                     znaki++;
                     if(Character.isWhitespace(tekst.charAt(i))){
                         bialeznaki++;
                     }
                 }

                 trim = tekst.trim(); //usuwamy biale znaki z poczatku i konca linii
                 if (trim.isEmpty())
                 {
                     System.out.println(0);
                 }
                 else {
                     System.out.println(trim.split("\\s+").length); //dzielimy stringa na czesci \\s+ - 1 lub wiecej spacji
                 }


                 System.out.println(tekst);
                 bialeznaki++;//dla entera
                 tekst=br.readLine();
             }
             while (tekst!=null);
         }
         finally {
             br.close();
         }

        System.out.println(znaki);
        System.out.println(bialeznaki);



    }
}
