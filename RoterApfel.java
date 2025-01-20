import greenfoot.*;

public class RoterApfel extends Actor
{
    public void act()
    {
        setLocation(getX(),getY() + 1);

        if(getY() > 7)
        {
            this.getWorld().removeObject(this); //Wenn der Apfel den unteren Rand berührt, wird es gelöscht
        }
    }
}
