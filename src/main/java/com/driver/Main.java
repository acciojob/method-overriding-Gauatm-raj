package com.driver;

class A {
    String meth() {
        return "Invoking method from class A";
    }
}

// Task 2, 4: Define class B extending class A and overriding meth
class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Task 3, 5: Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of B and call meth
        B objB = new B();
        String ans= objB.meth();

    }
}