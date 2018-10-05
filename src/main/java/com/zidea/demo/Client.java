package com.zidea.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.zidea.demo.model.Tut;

public class Client {

    private Tut tut;

    public Client() {
    };

    /**
     * @return the tut
     */
    public Tut getTut() {
        return tut;
    }

    public static void main(String[] args) {

        List<String> tuts = new ArrayList<>();

        tuts.add("javascript");
        tuts.add("cpp");
        tuts.add("java");

        tuts.stream().forEach(str -> {
            System.out.println(str);
        });

        Tut tut = new Tut();
        tut.setName("javascript");
        System.out.print("hello world" + tut.getName() + " tut");
    }
}