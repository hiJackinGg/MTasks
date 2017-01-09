package com.company.task2;


public class Main {
    public static void main(String[] args) {

        System.out.println(fac(5));
    }

    public static int fac(int n){
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else
            return n*fac(n-1);
    }

}
