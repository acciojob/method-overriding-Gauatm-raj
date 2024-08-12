package com.driver;

public class Main {
    public static void main(String[] args) {
        // Creating an object of class B
        B objB = new B();

        // Calling the meth method from class A (inherited by B)
        System.out.println(objB.meth());  // Output: "Invoking method from class A"
    }
  
}