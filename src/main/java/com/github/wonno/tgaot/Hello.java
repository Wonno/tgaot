package com.github.wonno.tgaot;

class Hello {

  /** The Greeting. */
  private final String greet;

  Hello(final String greeting) {
    this.greet = greeting;
  }

  // FIXME: Greeting via CLI param
  public static void main(final String[] args) {
    final Hello hello = new Hello("World");
    // NICETOHAVE: TEST checking sout
    System.out.println(hello.getMessage());
  }

  // TODO: no getter
  String getMessage() {
    return "Hello " + greet;
  }
}
