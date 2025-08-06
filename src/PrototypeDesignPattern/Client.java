package PrototypeDesignPattern;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) throws Exception {

//        NetworkConnection nc = new NetworkConnection();
//        nc.setIp("127.0.0.1");
//        nc.setPort("8080");
//        nc.loadVeryImportantData();
//        System.out.println(nc);
//
//        NetworkConnection nc1 = nc.clone();
//        System.out.println(nc1);

        //Shallow cloning states that
//        Creates a new object and copies the values of the original object's properties.
//        If a property is another object, it copies the reference to that nested object,
//        not a new copy of the object itself

        ArrayList<String> domains = new ArrayList<>();
        domains.add("www.google.com");
        domains.add("www.facebook.com");
        domains.add("www.yahoo.com");

//        NetworkConnection nc = new NetworkConnection();
//        nc.setIp("127.0.0.1");
//        nc.setPort("8080");
//        nc.loadVeryImportantData();
//        System.out.println(nc);
//
//        nc.setDomain(domains);
//        NetworkConnection nc1 = nc.clone();
//        nc.getDomain().add("www.microsoft.com");
//        System.out.println("Original:"+nc);
//        System.out.println("Clone:"+nc1);


        /*
        * Deep cloning states that
        * Creates a new object and recursively copies all nested objects and their properties,
        *  ensuring no shared references between the original and the clone. */

        NetworkConnection nc = new NetworkConnection();
        nc.setIp("127.0.0.1");
        nc.setPort("8080");
        nc.loadVeryImportantData();
        System.out.println(nc);

        nc.setDomain(domains);
        NetworkConnection nc1 = nc.clone();
        nc.getDomain().add("www.microsoft.com");
        System.out.println("Original:"+nc);
        System.out.println("Clone:"+nc1);



    }
}
