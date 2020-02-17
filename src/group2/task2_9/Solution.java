package group2.task2_9;

public class Solution {
    public static void main(String[] args) {

    equalsTriangle(4,4,4);
    }
    private static void equalsTriangle(int a, int b, int c){
        if(a>0&&b>0&&c>0) {
            if (a == b && b == c) {
                System.out.println("Да, он равносторонний");
            }
        }
    }
}
