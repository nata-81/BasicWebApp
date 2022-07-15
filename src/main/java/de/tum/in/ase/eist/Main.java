package de.tum.in.ase.eist;

public class Main {
    public static void main(String[] args) {
        String query = "what 55 plus 8";
        String[] array = query.split(" ");
        int number = 0;
        for (String x:
                array) {
            try {
                number += Integer.parseInt(x);
            }catch (Exception e){

            }
        }

        System.out.println(number);
    }
}
