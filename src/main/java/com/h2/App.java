package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return -1*2;
    }

    private static int add(int[] numbers){
        int sum = 0;
        for (int k=0; k<numbers; k++){
            sum += numbers[k];
        }
        return  sum;
    }
}
