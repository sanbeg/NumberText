package com.sanbeg.java.numbertext;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steve on 3/29/17.
 */
public class NumberTextEnTest {

    NumberText subject = new NumberTextEn();

    @Test
    public void testOne() {
        assertEquals("minus one", subject.number(-1));
        assertEquals("zero", subject.number(0));
        assertEquals("one", subject.number(1));

        assertEquals("fifteen", subject.number(15));
        assertEquals("thirty five", subject.number(35));
    }

    @Test
    public void testHundreds() {
        assertEquals("one hundred", subject.number(100));
        assertEquals("one hundred twenty three", subject.number(123));
        assertEquals("one hundred fourteen", subject.number(114));
        assertEquals("three hundred forty five", subject.number(345));
    }

    @Test
    public void testThousands() {
        assertEquals("one thousand",         subject.number(1000));
        assertEquals("ten thousand",         subject.number(10000));
        assertEquals("one hundred thousand", subject.number(100000));

        assertEquals("one million",         subject.number(1000000));
        assertEquals("ten million",         subject.number(10000000));
        assertEquals("one hundred million", subject.number(100000000));

        assertEquals("one hundred million ten thousand", subject.number(100000000 + 10000));
        assertEquals("one hundred million one hundred thousand", subject.number(100000000 + 100000));

        assertEquals("one hundred twenty three thousand four hundred fifty six", subject.number(123456));

        assertEquals("two billion", subject.number(2000000000));
    }

}