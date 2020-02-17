package group2.task2_8;

public class Solution {
    public static void main(String[] args) {

    minSquare(4,-7);
    }
    private static void minSquare(int a, int b){
        if(Math.pow(a,2)>Math.pow(b,2)){
            System.out.println("Минимальный квадрат " + Math.pow(a,2));
        }
        else if(Math.pow(a,2)<Math.pow(b,2)){
            System.out.println("Минимальный квадрат " + Math.pow(b,2));
        }
        else {
            System.out.println("Они равны" + Math.pow(b,2));
        }

    }
}
