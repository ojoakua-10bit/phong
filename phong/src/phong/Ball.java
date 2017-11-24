package phong;
import java.awt.*;
import java.util.Random;

public class Ball {
    public int x, y, width = 25, height = 25;
    public int motionX, motionY;
    public Random random;
    private Phong pong;
    public int amountOfHits;
    
    public Ball(Phong pong){
        this.pong = pong;
        this.random = new Random();
        spawn();
    }
    
    public void spawn(){
        this.amountOfHits = 0;
        
    }
}
