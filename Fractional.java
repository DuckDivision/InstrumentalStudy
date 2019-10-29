public class Fractional implements Comparable<Fractional> {
    private int nominator;
    private int denominator;
  
    public Fractional(int nominator, int denominator) throws IllegalArgumentException
    {
      this.nominator =nominator;
      if(denominator!=0)
      {
        this.denominator = denominator;
      }
      else
      {
        throw new IllegalArgumentException("Denominator can't be 0");
      }
    }
  
    public double toDouble()
    {
      return (double)(nominator/denominator);
    }
  
    @Override
    public int compareTo(Fractional o) {
      double thisDouble = this.toDouble();
      double oDouble = o.toDouble();
      if(thisDouble>oDouble)
      {
        return 1;
      }
      else if(thisDouble==oDouble)
      {
        return 0;
      }
      else
      {
        return -1;
      }
    }
  
    @Override
    public String toString() {
      return nominator + "/" + denominator;
    }
    public Fractional add(Fractional other)
    {
      int d = (this.denominator==other.denominator)?this.denominator:this.denominator*other.denominator;
      int n = (this.denominator==d)?this.nominator+other.nominator:this.nominator*other.denominator+other.nominator*this.denominator;
      return new Fractional(n,d);
    }
  }