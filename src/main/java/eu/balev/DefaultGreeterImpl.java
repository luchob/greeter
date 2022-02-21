package eu.balev;

public class DefaultGreeterImpl implements GreeterIfc{

  @Override
  public void greet(String name) {
    System.out.println("Hello, " + name + "!");
  }
}
