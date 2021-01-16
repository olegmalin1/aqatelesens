package com.academy.telesens.lesson10.hometask;

import java.util.ArrayList;
import java.util.Collections;

public class Hometask01 {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        Collections.addAll(namesList, "Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max");
        System.out.println(namesList);

        Collections.addAll(namesList, "Philip", "Joseph", "Leon");
        System.out.println(namesList);

        namesList.remove("Veronica");
        namesList.remove("Leonid");
        System.out.println(namesList);

        namesList.set(1, "Elizabet");
        System.out.println(namesList);

        //namesList.sort(String::compareToIgnoreCase);
        Collections.sort(namesList, String::compareToIgnoreCase);
        System.out.println(namesList);

        Collections.reverse(namesList);
        System.out.println(namesList);
    }
}
