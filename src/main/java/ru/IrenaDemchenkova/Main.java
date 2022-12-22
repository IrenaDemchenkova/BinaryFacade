package ru.IrenaDemchenkova;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("100011", "10100"));
        System.out.println(bins.mult("10011100", "110011"));
    }
}