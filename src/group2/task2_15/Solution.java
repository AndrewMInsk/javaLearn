package group2.task2_15;

public class Solution {
    public static void main(String[] args) {

        double a = -10;
        double b = 20;
        double halfSum = (a+b)/2;
        double product = a*b*2;
            if(a<b){
                a=halfSum;
                b=product;
            }
            else{
                a=product;
                b=halfSum;
            }
        System.out.println(a+" "+b);
    }

}
