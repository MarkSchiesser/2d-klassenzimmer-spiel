import greenfoot.*;

public class Buch extends Actor
{
    public void act()
    {
        setLocation(getX(),getY() + 1); // Das Buch wird nach unten bewegt

        if(getY() > 7)
        {
            this.getWorld().removeObject(this); //Wenn das Buch den unteren Rand berührt, wird es gelöscht
        }
        else if(isTouching(GrünerApfel.class))
        {
            this.getWorld().removeObject(this); //Wenn das einen grünen Apfel berührt, wird es gelöscht
        }
    }
}