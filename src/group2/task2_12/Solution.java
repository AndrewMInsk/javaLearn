package group2.task2_12;

public class Solution {
    public static void main(String[] args) {

    triangleSquare(4.5,-11,12);
    }
    private static void triangleSquare(double ...a){

        for(double item : a){
            if(item>=0) {
                System.out.println(Math.pow(item,2));
            }
            else{
                System.out.println(Math.pow(item,4));

            }
        }


    }
}
