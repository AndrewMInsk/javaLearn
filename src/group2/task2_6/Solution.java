package group2.task2_6;

public class Solution {
    public static void main(String[] args) {

    max(4,7);
    }
    private static void max(int a, int b){
        if(a>b){
            System.out.println("Максимальное " + a);
        }
        else if(a<b){
            System.out.println("Максимальное " + b);
        }
        else {
            System.out.println("Они равны");
        }

    }
}
