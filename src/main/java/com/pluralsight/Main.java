package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        DealershipFileManager dfm = new DealershipFileManager();
        Dealership d = dfm.getDealership();
        System.out.println(d.getDealershipName());
        dfm.saveDealership(d);

       // System.out.println(d);

    }
}