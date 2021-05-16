package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // вводится символ
        //1. определить буква ли это
        //1.1. если буква маленькая или большая буква
        //2 если не буква опреелить цифра ли это
        //2.1. если цифра четная или нечентная
        //3. иначе вывести неопознанный символ

        char symbol;

        Scanner input = new Scanner(System.in);

        System.out.print("Input symbol ");
        symbol = input.next().charAt(0);

        if(symbol>='a' && symbol<='z' || symbol>='A' && symbol<='Z'){
            System.out.println("this is letter");

            if(symbol>='a' && symbol<='z'){
                System.out.println("small");
            }
            else{
                System.out.println("big");
            }

        }
        else if (symbol>='0' && symbol<='9'){
            System.out.println("this is digit");

            if(symbol%2==0){
                System.out.println("even");
            }

            else {
                System.out.println("odd");
            }
        }

        else {
            System.out.println("this is unkhnow");
        }
    }
}

