package group2.task2_11;

public class Solution {
    public static void main(String[] args) {

    triangleSquare(4,11,12,22,33,44);
    }
    private static void triangleSquare(int a, int b, int c, int d, int e, int f){

        double pp1 = (a+b+c)*1.0/2;
        double pp2 = (d+e+f)*1.0/2;
        double square1 = Math.sqrt(pp1*(pp1-a)*(pp1-b)*(pp1-c));
        double square2 = Math.sqrt(pp2*(pp2-d)*(pp2-e)*(pp2-f));
        if(square1>square2) {
            System.out.println("Больше первый");
        }
        else{
            System.out.println("Больше второй");
        }
    }
}
