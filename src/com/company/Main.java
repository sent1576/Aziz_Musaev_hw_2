package com.company;

public class Main {

    public static void main(String[] args) {
        String a = ageAndTemperature(10, 20);
        System.out.println(a);
        String b = ageAndTemperature(19, 25);
        System.out.println(b);
        String c = ageAndTemperature(43, 2);
        System.out.println(c);
        String d = ageAndTemperature(10, 20);
        System.out.println(d);
        String e = ageAndTemperature(50, 35);
        System.out.println(e);
        String f = ageAndTemperature(generateRandomAge(), 35);
        System.out.println(f);

    }

    public static String ageAndTemperature(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && 0 < temperature && temperature < 28) {
            return "Можно идти гулять";
        } else if (age < 45 || -10 < temperature && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }

    public static int generateRandomAge() {
        return (int) Math.round(Math.random() * 100);
    }

}
