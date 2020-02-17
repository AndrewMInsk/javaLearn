package group2.task2_5;

public class Solution {
    public static void main(String[] args) {

    min(4,7);
    }
    private static void min(int a, int b){
        if(a>b){
            System.out.println("Минимальное " + b);
        }
        else if(a<b){
            System.out.println("Минимальное " + a);
        }
        else {
            System.out.println("Они равны");
        }

    }
}
