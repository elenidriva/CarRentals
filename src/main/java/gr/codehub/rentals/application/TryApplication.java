package gr.codehub.rentals.application;

import java.io.IOException;

public class TryApplication {

    public static int getResult() throws IOException {

        Object o = null;
        // line 10 is problematic then we will go to catch, it will print and it will TRY to reutn 2 BUT before it does that it will go to finally and return 3
        // it will NOT go back to return 2 (start  > end > exc end > finally starts, finally ends > return 3)
        // if finally block did not have return 3; it WILL go to return 2; (start > exc start > end > exc end > finally starts, finally ends > return 2)
        // if return 2 does not exist then (start  exc end > finally starts, finally ends > return 1
        try {
            System.out.println("Start");
            System.out.println("o.hashCode()" + o.hashCode());
            System.out.println("End");
            return 1;
        } catch ( Exception e) {
            System.out.println("Exception start");
            System.out.println("FException ends");
            return 2;
        } finally {
            System.out.println("Finally starts");
            System.out.println("Finally ends");
            return 3;

        }



// Will never be reached
//        try {
//            System.out.println("Start");
//            System.out.println("o.hashCode()" + o.hashCode());
//            System.out.println("End");
//            return 1;
//        } finally {
//            System.out.println("Finally starts");
//            System.out.println("Finally ends");
//            //return 3;
//
//        }
//        return 5;


    }

}