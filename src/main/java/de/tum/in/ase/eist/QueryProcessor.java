package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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
            List<Integer> list = new ArrayList<Integer>();
            for (String x:
                    array) {
                try {
                    list.add(Integer.parseInt(x));
                }catch (Exception e){
                    continue;
                }

            return "" + list.stream().mapToInt(y -> y).max();
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
