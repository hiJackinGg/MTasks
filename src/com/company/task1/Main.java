package com.company.task1;


import java.text.ParseException;

public class Main {
    public static void main(String[] args) {

        String stringToConvert ="-123456";
        System.out.println("String: \"" + stringToConvert + "\"");
        int output = myParseInt(stringToConvert);
        System.out.println("Integer: "+ output);
    }

    public static int myParseInt(String str){
        int i = 0, number = 0;
        boolean isNegative = false;
        int len = str.length();

        //if number is negative fixate it and skip this character
        if(str.charAt(0) == '-'){
            isNegative = true;
            i = 1;
        }

        while(i < len){
            //multiply by ten to append new digit
            number *= 10;
            //as we have last digit is '0' then just add new number (character)
            number += (str.charAt(i++) - '0');
        }

        if(isNegative)
            number = -number;

        return number;
    }

}
