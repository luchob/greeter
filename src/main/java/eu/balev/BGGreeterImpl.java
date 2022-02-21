package eu.balev;

public class BGGreeterImpl implements GreeterIfc{

  @Override
  public void greet(String name) {
    System.out.println("Здравей, " + name + "!");
  }
}
