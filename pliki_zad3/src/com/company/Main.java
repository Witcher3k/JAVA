package com.company;

import java.io.*;

public class Main {

    static void sumujIZapisz(String nazwaPliku) throws IOException {
        try {


            FileReader fr = new FileReader(nazwaPliku);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(nazwaPliku, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String tekst = "";
            int licz = 0;

            try {
                do {
                    try {
                        tekst = br.readLine();
                        licz = Integer.parseInt(tekst) + licz;
                    } catch (NumberFormatException ex) {
                        continue;
                    }


                } while (tekst != null);


                bw.write("dopisane" + licz);
                bw.newLine();
            } finally {
                br.close();
                bw.close();

            }

        }catch(FileNotFoundException ex){ // w razie gdy nie ma pliku tworzymy nowy
            try{
                PrintWriter writer = new PrintWriter("plik.txt", "UTF-8");
                writer.close();
            } catch (IOException e) {
                // do something
            }
        }
    }

    public static void main(String[] args)throws IOException {

        sumujIZapisz("plik.txt");


    }
}
