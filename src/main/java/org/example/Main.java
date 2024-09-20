package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        PrintStream out =new PrintStream(System.out,true, StandardCharsets.UTF_8);

        //tar1
        System.out.println("Hello , world");

        //tar2
        Scanner scanner= new Scanner(System.in);
        System.out.println("type a number");
        int num1 = scanner.nextInt();
        System.out.println("type a number");
        int num2 = scanner.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);

        // tar3
        System.out.println("type a number");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

        //tar4
        System.out.println("type a number");
        int n = scanner.nextInt();
        System.out.println("type a number");
        int n2 = scanner.nextInt();
        System.out.println("type a number");
        int n3 = scanner.nextInt();
        int avg = (n+n2+n3)/3;
        System.out.println(avg);

        //tar5
        System.out.println("type a grade");
        int grade = scanner.nextInt();
        if(grade>90){
            out.println("מצוין");
        } else if (grade>=80 && grade<=90) {
            out.println("טוב מאוד");
        } else if (grade>=70 && grade<80) {
            out.println("טוב");
        } else if (grade<70) {
            out.println("נכשל");
        }

        //tar6
        for(int i=1;i<11;i++){
            System.out.println(i);
        }

        //tar7
        System.out.println("type a number");
        int N = scanner.nextInt();
        while (N>=0){
            System.out.println(N);
            N--;
        }

       //tar8-2
        System.out.println(addNumbers(5,7));

        //tar9-2
         Person Maya = new Person("מאיה",16);
         out.println(Maya.getName() + "," + Maya.getAge());

         //tar10
        int [] arr = new int [5] ;
        arr = new int[]{1, 2, 3, 4, 5};
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
    //tar8-1
    public  static int addNumbers(int num,int num2){
        return num+num2;
    }


}


