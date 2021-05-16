package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dayOfWeek;

        System.out.println("input dayOfWeek:");
        dayOfWeek = input.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("pn");
                break;
            case 2:
                System.out.println("vt");
                break;
            case 3:
                System.out.println("sr");
                break;
            case 4:
                System.out.println("ct");
                break;
            case 5:
                System.out.println("pt");
                break;
            case 6:
                System.out.println("sub");
                break;
            case 7:
                System.out.println("vsk");
                break;
            default:
                System.out.println("takogo net");
                break;
        }

    }
}
