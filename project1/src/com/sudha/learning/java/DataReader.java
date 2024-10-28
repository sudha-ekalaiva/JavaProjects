package com.sudha.learning.java;

import java.util.Scanner;

public class DataReader {

    //Write a method to read a line to get set of numbers from user
    public static int[] readData()
    {
        String strNumbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("provide your number");
       strNumbers= (sc.nextLine());
       String[] arrayNumbers = strNumbers.split(" ");
        int[] data = new int[arrayNumbers.length];
       for(int i=0;i< arrayNumbers.length;i++){

           data[i] = Integer.parseInt(arrayNumbers[i]);
       }
       return data;
    }


    //write a method to read a line as input and split as tokens using delimeter
    //TODO:

    public static void main(String[] args) throws Exception{
        int[] data =  readData();
        for(int i =0;i<data.length;i++)
            System.out.println(data[i]);
    }

}
