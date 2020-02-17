package group2.task2_17;

public class Solution {
    public static void main(String[] args) {

        int x = 11;
        int y = 10;
            if (x == y) {
                x=y=0;
            }
            else{
                x=y=Math.max(x,y);
            }
        System.out.println(x+" "+y);
    }

}
