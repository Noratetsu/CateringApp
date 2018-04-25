package g6.enums;

/**
 * Created by Brandon Keen on 4/24/2018.
 */

public enum Hall {
    Arlington("Arlington"),KC("KC"),Maverick("Maverick"),Shard("Shard"),Liberty("Liberty");
    private final String hall;
    Hall(final String h)
    {
        hall = h;
    }

    @Override
    public String toString()
    {
        return hall;
    }


}
