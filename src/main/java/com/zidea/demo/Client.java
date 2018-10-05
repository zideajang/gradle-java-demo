package com.zidea.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;

import com.zidea.demo.model.Tut;

public class Client {

    final Pattern emailPattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

    final Function<String, Boolean> emailChecker = s -> emailPattern.matcher(s).matches();

    public void testMail(String email) {
        // if (emailPattern.matcher(email).matches()) {
        // System.out.println("validated email");
        // } else {
        // System.out.println("unvalidated email");
        // }
        if (emailChecker.apply(email)) {
            System.out.println("validated email...");
        } else {
            System.out.println("unvalidated email");
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.testMail("zidea2015@163.com");
    }
}