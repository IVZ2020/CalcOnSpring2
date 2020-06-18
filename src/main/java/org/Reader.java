package org;

import org.springframework.context.annotation.Bean;

import java.util.Scanner;


public class Reader {

    public double readerDouble () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public String readerOperation () {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
