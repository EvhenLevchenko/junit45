package com.mycompany.app;

import org.apache.commons.lang.text.StrBuilder;

import java.util.Arrays;

public class MyUtils {

    public static int add(int x, int y){
        return x + y;
    }

    public static String reverse(String input){
        return new StrBuilder(input).reverse().toString();
    }

    public int min(int[] inputs){
        Arrays.sort(inputs);
        return inputs[0];
    }

}
