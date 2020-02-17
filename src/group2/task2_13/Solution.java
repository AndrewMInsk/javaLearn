package group2.task2_13;

public class Solution {
    public static void main(String[] args) {

        length(4.5,-11,12,19);
    }
    private static void length(double a, double b, double c, double d){

     double length1 = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
     double length2 = Math.sqrt(Math.pow(c,2)+Math.pow(d,2));
            if(length1<length2){
                System.out.println("Первый ближе");
            }
            else{
                System.out.println("Второй ближе");
            }

    }
}
