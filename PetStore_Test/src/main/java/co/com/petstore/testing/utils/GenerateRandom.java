<<<<<<< HEAD
package co.com.petstore.testing.utils;

import java.util.Random;

public class GenerateRandom {

    private static final Random rand = new Random();

    private GenerateRandom() {
    }

    public static String data(int length) {
        String randomValues = "0123456789";
        int index;
        StringBuilder randomString = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            index = rand.nextInt(randomValues.length());
            randomString.append(randomValues.charAt(index));
        }
        return randomString.toString();
    }
=======
package co.com.petstore.testing.utils;

import java.util.Random;

public class GenerateRandom {

    private static final Random rand = new Random();

    private GenerateRandom() {
    }

    public static String data(int length) {
        String randomValues = "0123456789";
        int index;
        StringBuilder randomString = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            index = rand.nextInt(randomValues.length());
            randomString.append(randomValues.charAt(index));
        }
        return randomString.toString();
    }
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
}