package group2.task2_14;

public class Solution {
    public static void main(String[] args) {

        length(90,60,30);
    }
    private static void length(int a, int b, int c){


        if(a+b+c==180){
            if(a==90||b==90||c==90){
                System.out.println("Прямоугольный");
            }
            else {
                System.out.println("Существует, но не прямоугольный");
            }
        }
        else{
            System.out.println("Не существует");
        }

    }
}
