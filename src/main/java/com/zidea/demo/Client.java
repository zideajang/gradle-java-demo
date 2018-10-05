package com.zidea.demo;

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
        Tut tut = new Tut();
        tut.setName("javascript");
        System.out.print("hello world" + tut.getName() + " tut");
    }
}