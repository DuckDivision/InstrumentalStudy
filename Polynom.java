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

  public Polynom sum(Polynom pol)
  {
    Polynom result = new Polynom();
    int size = Math.min(this.size(), pol.size());
    for(int i = 0; i < size; i++)
    {
      result.add(fractionalList.get(i).add(pol.fractionalList.get(i)));
    }
    if(this.size()>pol.size())
    {
      for(int i=size;i<this.size();i++)
      {
        result.add(this.fractionalList.get(i));
      }
    }
    else
    {
      for(int i = size; i < pol.size(); i++)
      {
        result.add(pol.get(i));
      }
    }
    return result;
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < fractionalList.size(); i++)
    {
      result+=fractionalList.get(i).toString()+"*x^"+i;
      if(i!=fractionalList.size()-1)
      {
        result+=" + ";
      }
    }
    return result;
  }
}