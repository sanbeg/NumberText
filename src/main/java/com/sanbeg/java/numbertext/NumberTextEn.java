package com.sanbeg.java.numbertext;

/**
 * Created by steve on 3/29/17.
 */
public class NumberTextEn implements NumberText {

    final String [] ones = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",

            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
    };

    final String [] tens = {
            "zero",
            "ten",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
    };

    private int large(StringBuilder builder, int n, String name, int num) {
        number(builder, n/num);
        builder.append(' ');
        builder.append(name);
        n %= num;
        if (n > 0) {
            builder.append(' ');
        }
        return n;
    }

    private void number(StringBuilder builder, int n) {

        if (n < 0) {
            builder.append("minus ");
            n *= -1;
        }

        if (n >= 1000000) {
            n = large(builder, n, "million", 1000000);
        }

        if (n >= 1000) {
            n = large(builder, n, "thousand", 1000);
        }

        if (n >= 100) {
            n = large(builder, n, "hundred", 100);
        }

        if (n >= 20) {
            builder.append(tens[n/10]);
            n %= 10;
            if (n > 0) builder.append(' ');
        }

        if (n > 0 || builder.length() == 0) {
            builder.append(ones[n % 20]);
        }
    }

    public String number(int n) {
        StringBuilder builder = new StringBuilder();
        number(builder, n);
        return builder.toString();
    }
}
