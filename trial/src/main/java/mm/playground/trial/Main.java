package mm.playground.trial;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    try {
      Thread.sleep(60000L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
