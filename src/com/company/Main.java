package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Pojo f = new File();

        Pojo p = new Parser();

        Scanner in = new Scanner(System.in);
        System.out.println("¬вод: ");
        String str = in.nextLine();

        String[] arr = p.Parser(str);

        arr = p.keywordSelection(arr);

        f.printFunction(arr);
    }
}
