package group2.task2_21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Кто ты: мальчик или девочка? Введи Д или М");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String line;
            while ((line=reader.readLine())!=null){
                if(line.toLowerCase().equals("д")){
                    System.out.println("Мне нравятся девочки!");
                    break;
                }
                else if (line.toLowerCase().equals("м")){
                    System.out.println("Мне нравятся мальчики!");
                    break;

                }
                else {
                    System.out.println("Не тупим");

                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
