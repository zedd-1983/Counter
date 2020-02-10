package ie.gmit;

public class Counter {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public Counter(int startingCount)
    {
        if(startingCount < 0)
            throw new IllegalArgumentException("Must be greater than zero");
        else
            this.count = startingCount;
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
