package com.guvenbe.threads.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        System.out.println("This is output");

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a number:");
        int num = scanner.nextInt();
        System.out.println("Your number: " + num);
        scanner.close();

        int selected = 1;

        switch (selected) {
            case 1:
                System.out.println("select 1");
                break;
            case 2:
                System.out.println("select 1");
                break;
            case 3:
                System.out.println("select 1");
                break;
            default:
                System.out.println("not selected");
                break;
        }

        for (int i = 0; i <5 ; i++) {
            System.out.println(i);
        }
        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
        }
        do{
            System.out.println(i);
            i++;
        }while (i<5);

        int[] numbers = new int[5];
        int[] numbers2 = new int[]{3,4,5,6,7};
        String[] shapes = new String[]{"circle", "rectangle", "eclipse"};
        numbers[0] = 5;
        numbers[1] =18;

        for (int number : numbers) {
            System.out.println(number);
        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j <5 ; j++) {
            list.add(j+1);

        }

        list.forEach(System.out::println);

    }
}