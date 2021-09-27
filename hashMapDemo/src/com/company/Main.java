package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<>();
        sozluk.put("pencil","kalem");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println(sozluk.size());

        for (String item : sozluk.keySet()){
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }

        sozluk.remove("table");
        System.out.println(sozluk);
        System.out.println(sozluk.get("computer"));
        sozluk.clear();
        System.out.println(sozluk.get("pencil"));

    }
}
