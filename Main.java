public class Main {
  public static void main(String[] args)
  {
    FractionalList list1 = new FractionalList();
    FractionalList list2 = new FractionalList();
    try {
      list1.read("LOCAL FILE PATH");
      list2.read("LOCAL FILE PATH");
    }
    catch (Exception e)
    {
      System.out.println(e);
    }
    Polynom polynom = new Polynom(list1);
    System.out.println(polynom.sum(new Polynom(list2)));
  }
}