import java.util.*;

public class FractionalList implements Iterable<Fractional> {
  protected ArrayList<Fractional> list;

  public FractionalList()
  {
    list = new ArrayList<>();
  }

  @Override
  public Iterator<Fractional> iterator() {
    return list.iterator();
  }
  public void add(Fractional fractional)
  {
    list.add(fractional);
    Collections.sort(list);
  }
  public Fractional get(int index)
  {
    return list.get(index);
  }
  public int size()
  {
    return list.size();
  }
  public void remove(Fractional fractional)
  {
    list.remove(fractional);
  }
  public Fractional min()
  {
    return list.get(0);
  }
  public Fractional max() {
    return list.get(list.size() - 1);
  }
}