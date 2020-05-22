package ru.geekbrains.lesson1;

public class MainApp {

    public static int summ(int a, int b, int c, int d){
        int sum = a * (b + (c / d));
        return  sum;

    }

    public static boolean check1(int x,int y){
        int mmm= x+y;
        return mmm>=10&&mmm<=20;

    }
    public static void check2(int z){
        System.out.println(z>=0?"положительное":"отрицательное");
    }
    public static boolean check3(int g){
        return g<0;
    }
    public static void printname(String name){
        System.out.println("Привет , " + name );
    }
    public static void isyearvisokos(int year){
        //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println(year%4!=0&&year%400!=0||year%100==0?"Не високосный":"високосный");
    }

    public static void main(String[] args) {
        System.out.println(summ(1,2,3,4));
        System.out.println(check1(11,1));
        System.out.println(check1(20,1));
        check2(10);
        check2(-1010);
        System.out.println(check3(-10));
        System.out.println(check3(10));
        printname("Николай");
        isyearvisokos(2000);
        isyearvisokos(2020);
        isyearvisokos(2021);
        isyearvisokos(2022);
        isyearvisokos(2023);
        isyearvisokos(2024);
        isyearvisokos(2025);

        System.out.println("Hello, World!");
            byte a = -127;
        short b = -32768;
        int c = -2147483648;
        long d = -9223372036854775808L;
        float e = 12.43f;
        double f = -123.123;
        char char1 ='\uffff';
        boolean test = true;
        String name = "Vasya";



    }
}
