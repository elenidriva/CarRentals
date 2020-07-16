package gr.codehub.rentals.utility;

import javax.swing.*;

public class Logger {

    // File > Replace in Path > (Type what to find and what to replace
    public static void log (String text) {
        System.out.println("LOG: " +text);
        // JOptionPane.showMessageDialog( (null, text));


    }


    public static void print (String text) {
        System.out.println("PRINT: " + text);


    }
}
