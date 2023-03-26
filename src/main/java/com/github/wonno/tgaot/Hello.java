package com.github.wonno.tgaot;

class Hello {
    private final String greet;

    public Hello(String greet) {
        this.greet = greet;
    }


    //FIXME: Greeting via CLI param
     public static void main(String[] args) {
        Hello hello = new Hello("World");
        //NICETOHAVE: TEST checking sout
        System.out.println(hello.getMessage());
    }

    //TODO: no getter
    String getMessage() {
        return "Hello " + greet;
    }

}
