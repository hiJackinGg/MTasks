package com.company.task3;


public class Main {
    public static void main(String[] args) {

        System.out.println(deleteSym("Hello World !!!", 4));
    }

    public static String deleteSym(String word, int index){
        if ((index < 0) || (index >= word.length()))
            throw new StringIndexOutOfBoundsException(index);

        char[] stringChars = word.toCharArray();
        char[] newStringChars = new char[stringChars.length - 1];
        //move(copy) characters from right side to left
        System.arraycopy(stringChars, index+1, stringChars, index, word.length()-index-1);
        //remove last character in stringChars array (copy in new array)
        System.arraycopy(stringChars, 0, newStringChars, 0, newStringChars.length);

        return new String(newStringChars);
    }

}
