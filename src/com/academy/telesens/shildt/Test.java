package com.academy.telesens.shildt;

public class Test {
    public static void main(String[] args) {

        String s ="";
        String s1 ="*";
        for (int i = 1; i< 8; i++)
        {
            System.out.println(s);
            s = s + s1;
        }

//        double dume, meter;
//        int counter, fut;
//        counter = 0;
//
//        for (fut = 0; fut < 12; fut++) {
//            for (dume = 0; dume < 12; dume++) {
//                if (fut == 0) {
//                    meter = dume * 0.0254;
//                } else if (dume == 0) {
//                    meter = fut * 12 * 0.0254;
//                } else {
//                    meter = (fut * 12 + dume) * 0.0254;
//                }
//                System.out.println(fut + " futs " + dume + " dumes = " + meter + " meters");
//                counter++;
//                if (counter == 12) {
//                    System.out.println();
//                    counter = 0;
//                }
//            }
//        }

    }
}
