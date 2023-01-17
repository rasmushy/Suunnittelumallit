package tehdas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TehdasTesti {
    public static void main(String[] args) {
        Class c1 = null;
        VaateTehdas tehdas = null;
        Class c2 = null;
        Henkilo jasper = null;

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("./src/tehdas.properties"));
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        try {
            c1 = Class.forName(properties.getProperty("vaateTehdas"));
            tehdas = (VaateTehdas) c1.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            c2 = Class.forName(properties.getProperty("henkiloTehdas"));
            jasper = (Henkilo) c2.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        jasper.pueVaate(tehdas);
        System.out.println(jasper);
    }
}
