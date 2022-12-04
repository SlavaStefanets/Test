package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = scan();
        int b = scan();
        System.out.println(sum(a,b));
        System.out.println(sumTwo(a,b));
        System.out.println(sumThree(a,b));
        System.out.println(sumFor(a,b));
    }
    public static int scan(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sumTwo(int a, int b){
        return a - b;
    }
    public static int sumThree(int a, int b){
        return a * b;
    }
    public static int sumFor(int a, int b){
        return a / b;
    }
}