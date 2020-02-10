package ie.gmit;

public class Counter {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public int getCount()
    {
        return this.count;
    }

    public void incrementCount()
    {
        this.count++;
    }

    public void decrementCount()
    {
        this.count--;
    }
}
