package com.works;

public class Variables {
    public static void main(String[] args) {
        // byte -->     127                             -128
        // short -->    32,767                          -32,768
        // integer -->  2,147,483,647                   -2,147,483,648
        // long -->     9,223,372,036,854,775,807       -9,223,372,036,854,775,808

        int num1, num2 = 2, num3;
        num1 = 1;
        num3 = num1 + num2;
        System.out.println(num3);

        int kisaKenar = 10, uzunKenar = 20;
        int alan = kisaKenar * uzunKenar;
        int cevre = 2 * (kisaKenar + uzunKenar);
        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);

        // double -->   yuksek duyarli, hassas matematiksel islemlerinde kullanilir.
        // float -->    hizli ve bellekte az yer kaplar.

        float vFloat = 1;
        System.out.println(vFloat);

        float pi = 3.14f;
        System.out.println(pi);

        // char     -->     single character with ''
        // boolean  -->     true or false

        char c = 'x';
        System.out.println(c);

        boolean trueBool = true;
        boolean falseBool = false;
        System.out.println("false: " + falseBool);
        System.out.println("true: " + trueBool);

        // string

        String vStr = "Hakan Sahin";
        System.out.println(vStr);

        // operators
        /*
                &&  -->  and
                ||  -->  or
                !   -->  not
         */

        int a = 5, b = 6, cc = 5;
        boolean v1 = a == cc;
        System.out.println(v1);
        boolean v2 = a >= b;
        System.out.println(v2);
        boolean res = v1 && v2;
        System.out.println(res);

        String str = res ? "res: true" : "res: false";
        System.out.println(str);
    }
}
