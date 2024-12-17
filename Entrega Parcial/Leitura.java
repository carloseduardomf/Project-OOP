//Nome: Carlos Eduardo Martins Ferreira RA: 2576163

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

    public static String entDados(String rotulo) {

        System.out.println(rotulo);

        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);

        String ret = "";

        try {
            ret = buff.readLine();
        } catch (IOException ioe) {
            System.out.println("ERRO");
        }
        return ret;
    }

}
