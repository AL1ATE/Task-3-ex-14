package ru.vsu.cs.obukhov;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        SimpleQ<Integer> q = new SimpleQ<>();

        for (int i = 1; i < size; ++i){
            if (i % 2 == 1 ){
                System.out.println(i + 1);
                q.add(i);
            } else if(i % 2 == 0){
                System.out.println(i - 1);
                q.add(i);

            } else{
                System.out.println(i);
                q.add(i);
            }
        }




    }


}
