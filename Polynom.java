import java.util.ArrayList;
import java.util.Iterator;

public class Polynom implements Iterable<Fractional> {
  private ArrayList<Fractional> fractionalList;

  public Polynom()
  {
    fractionalList = new ArrayList<>();
  }
  public Polynom(FractionalList list)
  {
    fractionalList = new ArrayList<>();
    for(Fractional f:list)
    {
      fractionalList.add(f);
    }
  }
  public int size()
  {
    return fractionalList.size();
  }

  public void add(Fractional fractional)
  {
    fractionalList.add(fractional);
  }
  public Fractional get(int index)
  {
    return fractionalList.get(index);
  }

  @Override
  public Iterator<Fractional> iterator() {
    return fractionalList.iterator();
  }
}