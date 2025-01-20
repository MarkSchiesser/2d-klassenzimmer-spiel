import greenfoot.*;

public class Klassenzimmer extends World
{
    public Klassenzimmer()
    {    
        super(5, 9, 100); 
        
        for(int i = 0; i < 5; i++)
        {
            if(i != 2)
            {
                addObject(new Sitzplatz(), i, 2);
                addObject(new Sitzplatz(), i, 4);
                addObject(new Sitzplatz(), i, 6);
            }
        }
        /*
         * platziert Tische in den Reihen 2, 4 und 6 in Paaren im Klassenzimmer
        */
       
        Schueler stefan = new Schueler("right", "left", "up");
        addObject(stefan, 2, 7);
        Lehrerin melanie = new Lehrerin();
        addObject(melanie, 2, 0);
    }
}