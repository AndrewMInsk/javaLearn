package group2.task2_20;

public class Solution {
    public static void main(String[] args) {

        length(5,90,233,-345,300);
    }
    private static void length(int k, int ...z){
       for(int item: z){
           if(item%k==0) {
               System.out.println(item);
           }

       }

    }
}
