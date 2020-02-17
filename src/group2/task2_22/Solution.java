package group2.task2_22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int a = 134;
        int b = 122;
        int temp = 0;
            if(a<b){

                temp = a;
                a = b;
                b = temp;
            }
        System.out.println(a+" "+b);

    }

}
