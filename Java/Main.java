package Java;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    static Logger LOGGER;
    static {
        try(FileInputStream ins = new FileInputStream("/Users/mariannaadekova/Desktop/GB/Attestation")){ 
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Main.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            while (true) {
                Menu menu = new Menu();
                menu.start();
            }

        } catch (Exception e) {
            System.out.println("Come back soon!");
        }
    }
}
