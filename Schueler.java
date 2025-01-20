
import greenfoot.*;

public class Schueler extends Actor
{    
    public String RechtsTaste;
    public String LinksTaste;
    public String SchießTaste;
    public int gegesseneÄpfel;
    
    public Schueler(String rechtsTaste, String linksTaste,String schießTaste) //Der Konstruktor der Klasse Schüler
    {
        RechtsTaste = rechtsTaste;
        LinksTaste = linksTaste;
        SchießTaste = schießTaste;
    }
    
    public void act()
    {
        this.getWorld().showText("Gegessene Äpfel: " + gegesseneÄpfel, 1,0);
        
        if(isTouching(Buch.class))
        {
            removeTouching(Buch.class);
            this.getWorld().showText("Game Over!", 2, 4);
            Greenfoot.stop();
        }
        /*
         * Wenn ein Buch den Schüler berührt, verschwindet es, es wird
         * ein Game-over Text angezeigt und das Spiel stoppt
        */
       
        else if(isTouching(RoterApfel.class))
        {
            removeTouching(RoterApfel.class);
            gegesseneÄpfel++;
        }
        
        bewegen();
    }
    
    void bewegen()
    {
        if (Greenfoot.isKeyDown(RechtsTaste)) 
        {
            geheNachRechts();
        }
        else if (Greenfoot.isKeyDown(LinksTaste)) 
        {
            geheNachLinks();
        }
        /*
         * Man kann sich mit bestimmten Knöpfen nach links und rechts bewegen
        */
        else if (Greenfoot.isKeyDown(SchießTaste)) 
        {
            if(gegesseneÄpfel > 0)
            {
                schieße();
            }
        }
    }
    
    void geheNachLinks()     
    {
        setRotation(180);    
        move(1);                      
        setRotation(0);      
    }
    
    void geheNachRechts()     
    {
        setRotation(360);    
        move(1);                      
        setRotation(0);      
    }
    
    void schieße()
    {
       this.getWorld().addObject(new GrünerApfel(), getX(),getY() - 1); //erstellt einen Apfel in der 7. Reihe
       gegesseneÄpfel--;
    }
}