package com.github.wonno.tgaot;

class Hello {
    private final String greet;

    public Hello(String greet) {
        this.greet = greet;
    }

    public static void main(String[] args) {
        Hello hello = new Hello("World");
        System.out.println(hello.getMessage());
    }

    String getMessage() {
        return "Hello " + greet;
    }

}
