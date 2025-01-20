import greenfoot.*;

public class GrünerApfel extends Actor
{
    public void act()
    {
        setLocation(getX(),getY() - 1);

        if(getY() < 0)
        {
            this.getWorld().removeObject(this); //Wenn das Buch den unteren Rand berührt, wird es gelöscht
        }
        
    }  
}