public class Main {
  public static void main(String[] args)
  {
    Fractional fractional = new Fractional(4, 2);
    try {
      System.out.println(fractional.toString());
    }
    catch (Exception e)
    {
      System.out.println(e);
    }
  
  }
}
