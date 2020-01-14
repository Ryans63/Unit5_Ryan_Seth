public class Num implements Comparable{
    private int value;

    public Num(){
      value = 0;
    }
    public Num(int value){
      this.value = value;
    }
    public int getValue(){
      return value;
    }
    public void setValue(int value){
      this.value = value;
    }
    public String toString(){
      return "" + value;
    }
    public boolean equals(Num otherNum){
      return this.value == otherNum.value;
    }

    public int compareTo(Object other){
        Num otherNum = (Num) other;
        return this.getValue() - otherNum.getValue()
    }
}
