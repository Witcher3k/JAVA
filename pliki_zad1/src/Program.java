import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by k-mil on 2017-05-09.
 */



public class Program {
    public static int[] liczZnakiSlowa(String filename) throws IOException
    {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        int znaki=0;
        int bialeznaki=-1;
        int ileslow=0;
        String trim="";
        int[]tab=new int[3];
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
                    ileslow+=0;
                }
                else {
                 ileslow+=trim.split("\\s+").length; //dzielimy stringa na czesci \\s+ - 1 lub wiecej spacji
                }

                bialeznaki++;//dla entera
                tekst=br.readLine();

            }
            while (tekst!=null);
        }
        finally {
            br.close();
        }
            tab[0]=znaki; //bez entera
            tab[1]=bialeznaki;
            tab[2]=ileslow;
            return tab;
    }
    public static void main(String[] args) throws IOException {

        liczZnakiSlowa("plik.txt");

        for (int i = 0; i <liczZnakiSlowa("plik.txt").length ; i++) {
            System.out.println(liczZnakiSlowa("plik.txt")[i]);

        }


    }
}
