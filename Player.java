/**
		Tin Vo
 **/
import java.util.Random;
public class Player
{
    private Random rand;
	
    Player () 
    {
        rand = new Random();
    }
    
    public int play ()
    {
        int play = 1 + rand.nextInt(3);
        return play;
    }
 
}