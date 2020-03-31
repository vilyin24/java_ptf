package com.example.tests.appmanager2;

import java.util.ArrayList;
import java.util.List;

public class collections {

    public static void main(String[] args) {

    String [] langs = {"java","C#" ,"Python", "PHP"};

        List<String> languages = new ArrayList<String>();
        languages.add("java");
        languages.add("C#");
        languages.add("Python");
        languages.add("PHP");

    for (String l : languages){
        System.out.println("Я хочу выучить "+ l);
    }
    }
}
