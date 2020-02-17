package group2.task2_10;

public class Solution {
    public static void main(String[] args) {

    roundSquare(4,11);
    }
    private static void roundSquare(int a, int b){
        double square1 = Math.PI*Math.pow(a,2);
        double square2 = Math.PI*Math.pow(b,2);
            if(square1>square2) {
                System.out.println("Больше первый");
            }
            else{
                System.out.println("Больше второй");
            }
    }
}
