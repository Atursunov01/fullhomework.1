package com.company;

public class Main {

    public static void main(String[] args) {
        Oyunchular scanner = new Sport("оюнчулар саны",2,"nomer: 3",121);
        scanner.playing();

        Foodbol foodbol = new Foodbol("оюнчулар саны", 22,"nomer: 1",1872);
        vascketbol vascketbol = new vascketbol("оюнчулар саны",10,"nomer: 2",1891);

        Oyunchular[] array = {scanner};
        for (Oyunchular a: array) {
            System.out.println( "Tenis  boiuncha maalymat: " + a);
        }
        Oyunchular[] b = {foodbol};
        for (Oyunchular s: b) {
            System.out.println("Foodbol boiuncha maalymat: " +s);

        }
        Oyunchular[] s = {vascketbol};
        for (Oyunchular e:s) {
            System.out.println("Basketbol boiuncha maalymat: " + e);
        }



    }
}
