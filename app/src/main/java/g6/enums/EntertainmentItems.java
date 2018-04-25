package g6.enums;

/**
 * Created by Brandon Keen on 4/25/2018.
 */

public enum EntertainmentItems {
RecordedMusic("Recorded Music"), Band("Band");

private final String ei;

EntertainmentItems(final String r)
{
    ei = r;
}

@Override
    public String toString()
{
    return ei;
}


}
