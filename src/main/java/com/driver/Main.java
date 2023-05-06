package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwonly = new RWOnly();
//        rwonly.Name = "Arun";
//        System.out.println(rwonly.Name);
//        'Name' has private access in 'com.driver.RWOnly'
        rwonly.setName("Arun");
        System.out.println(rwonly.getName());
    }
}