package group2.task2_19;

public class Solution {
    public static void main(String[] args) {

        length(90,233,-345);
    }
    private static void length(int ...z){
        int counter=0;
           for(int item: z){
               if(item>0){
                   counter++;
               }
           }
        System.out.println(counter);

    }
}
