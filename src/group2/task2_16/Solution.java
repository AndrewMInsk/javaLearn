package group2.task2_16;

public class Solution {
    public static void main(String[] args) {

        length(90,0);
    }
    private static void length(int x, int y){

            if(x>0&&y>0){
                System.out.println("Четверть 1");
            }
            if(x>0&&y<0){
                System.out.println("Четверть 2");
            }
            if(x<0&&y<0){
                System.out.println("Четверть 3");
            }
            if(x<0&&y>0){
                System.out.println("Четверть 4");
            }
            if(x==0){
                System.out.println("Лежит на оси ординат");
            }
            if(y==0){
                System.out.println("Лежит на оси абсцисс");
            }
    }
}
