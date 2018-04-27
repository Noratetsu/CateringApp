package g6.Resources;

/**
 * Created by Brandon Keen on 4/24/2018.
 */

public enum Hall {
    Arlington("Arlington",100),KC("KC",25),Maverick("Maverick",50),Shard("Shard",25),Liberty("Liberty",75);
    private final String hall;
    private final int capacity;

    Hall(final String h, int cap)
    {
        hall = h;
        capacity = cap;
    }

    @Override
    public String toString()
    {
        return hall;
    }

    public int getCapacity() {
        return capacity;
    }



}
