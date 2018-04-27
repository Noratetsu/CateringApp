package g6.Resources;

/**
 * Created by Brandon Keen on 4/25/2018.
 */

public enum MealType {
American("American"),Chinese("Chinese"),French("French"),Greek("Greek"),Indian("Indian"),Italian("Italian"),Japanese("Japanese"),Mexican("Mexican"),Pizza("Pizza");

private final String type;
MealType(final String t)
{
    type = t;
}
@Override
    public String toString()
    {
        return type;
    }


}
