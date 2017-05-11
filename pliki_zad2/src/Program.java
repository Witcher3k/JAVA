import java.io.*;

/**
 * Created by k-mil on 2017-05-11.
 */
public class Program {
    public static void szukaj(String nazwaPlikWe,String nazwaPlikWy,String slowo) throws IOException{
        FileReader fr = new FileReader(nazwaPlikWe);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw=new FileWriter(nazwaPlikWy);
        BufferedWriter bw =  new BufferedWriter(fw);

        String tekst="";
        int linia=0;


        try {
            do {
                tekst = br.readLine();
                linia++;
                if (tekst!=null && tekst.contains(slowo)) {
                    bw.write(tekst+" linia:"+linia);
                    bw.newLine();
                }

            }
            while (tekst!=null);
        }
        finally {
            br.close();
            bw.close();
        }




    }
    public static void main(String[] args) throws IOException {
        szukaj("plik1.txt","plik2.txt","2");

    }
}
