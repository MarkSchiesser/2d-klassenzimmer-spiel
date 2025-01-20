import greenfoot.*;

public class Lehrerin extends Actor
{
    Boolean hatZuletztGeworfen = true;
    
    public void act()
    {
        
        if(isTouching(GrünerApfel.class))
        {
            removeTouching(GrünerApfel.class);
            this.getWorld().showText("Du hast gewonnen!", 2, 4);
            Greenfoot.stop();
        }
        
        /*
         * Wenn die Lehrerin einen grünen Apfel berührt,
         * wird das Spiel gestoppt und es wird angezeigt,
         * dass amn gewonnen hat
        */
       
        else if ((Greenfoot.getRandomNumber(2) + 1) % 2 == 0 && hatZuletztGeworfen == true )
        {
            geheInZufälligeRichtung();
            hatZuletztGeworfen = false;
        } //Lehrerin geht in eine zufällige Richtung
        
        else if (hatZuletztGeworfen == false && Greenfoot.getRandomNumber(20) < 16)
        {
            wirfBuch();
            hatZuletztGeworfen = true;
        }
        /*
         * Es gibt eine 50% Chance, dass sich die Lehrerin in eine zufällige Richtung bewegt
         * Wenn nicht, wirft sie ein Buch oder einen Apfel
         * Die If&Else Kontrollstruktur verhindert ebenfalls, dass zwei Bücher innerhalb 
         * kurzer Zeit nacheinander geworfen werden
        */
       
        while(hatZuletztGeworfen == false && Greenfoot.getRandomNumber(20) < 4)
        {
            wirfApfel();
            hatZuletztGeworfen = true;
        }
        /*
         * Solange die Lehrerin nicht geworfen hat, gibt es eine 20%-ige Chance, dass
         * ein Apfel geworfen wird
        */
    }
    
    void geheInZufälligeRichtung() //lässt die Lehrerin in eine zufällige Richtung gehen
    {
        if((Greenfoot.getRandomNumber(2) +1) % 2 > 0)
        {
            setLocation(getX() + 1, getY());
        }
        else
        {
            setLocation(getX() - 1, getY());
        }
    }
    
    void wirfBuch()
    {
        this.getWorld().addObject(new Buch(), getX(),getY() + 1); //erstellt ein Buch in der 2. Reihe
    }
    
    void wirfApfel()
    {
        this.getWorld().addObject(new RoterApfel(), getX(),getY() + 1); //erstellt einen Apfel in der 2. Reihe
    }
}