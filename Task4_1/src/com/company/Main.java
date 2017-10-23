package com.company;

public class Main {

    public static void main(String[] args) {
        String[] name = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
                "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] result = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 371, 265};

        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    int tmp = result[i];
                    result[i] = result[j];
                    result[j] = tmp;

                    String str = name[i];
                    name[i] = name[j];
                    name[j] = str;
                }
            }
        }

        for (int x = 0; x < result.length; x++) {
            System.out.println(result[x] + " " + name[x]);
        }
    }
}
