package com.company;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class doubleformat {
    public static void main(String[] args) {
        double val = 12.1239;
        DecimalFormat dec = new DecimalFormat("#0.00");
        System.out.println(dec.format(val));

        /*
        String prdt = dec.format(val);
        System.out.println(prdt);
        */

        double num = Math.PI;
        double roundUp = BigDecimal.valueOf(num).setScale(3, RoundingMode.UP).doubleValue();

        double x =1203.0785;
        double roundDowm = BigDecimal.valueOf(x).setScale(2,RoundingMode.DOWN).doubleValue();

        System.out.println(roundUp+ " "+ roundDowm);

    }
}
