package com.academy.telesens.lesson01;

public class Hometask02 {
    public static void main(String[] args) {


        if (args.length == 1) {
            String pref = args[0];
            System.out.println(pref + " Peter, Hello!");
            System.out.println(pref + " Peter, This is my first program. I write on Java.");
            System.out.println(pref + " Programming is interesting.");
            System.out.println(pref + " My goal is to learn automation");
        } else if (args.length == 2) {
            String pref = args[0];
            String post = args[1];
            System.out.println(pref + " Peter, Hello! " + post);
            System.out.println(pref + " Peter, This is my first program. I write on Java. " + post);
            System.out.println(pref + " Programming is interesting. " + post);
            System.out.println(pref + " My goal is to learn automation " + post);
        } else {
            System.out.println("Peter, Hello!");
            System.out.println("Peter, This is my first program. I write on Java.");
            System.out.println("Programming is interesting.");
            System.out.println("My goal is to learn automation");
        }
    }
}
