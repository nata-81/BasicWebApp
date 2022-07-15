package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "natac";
        } else if (query.contains("plus")) {
            String[] array = query.split(" ");
            int number = 0;
            for (String x:
                 array) {
                try {
                    number += Integer.parseInt(x);
                }catch (Exception e){
                    continue;
                }
            }
            return "" + number;
        }
        else if (query.contains("largest")) {
            query.replace(",","");
            String[] array = query.split(" ");

            return "" + Math.max(Integer.parseInt(array[8]),Integer.parseInt(array[9]));
        }
//        else if (){
//            return "";
//        }
//        else if (){
//            return "";
//        }
//        else if (){
//            return "";
//        }
        //        else if (){
//            return "";
//        }
        else {
            return "";
        }
    }
}
