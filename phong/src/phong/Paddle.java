package phong;
import java.awt.*;

public class Paddle {
    public int paddleNumber;
    public int x, y, width = 50, height = 250;
    public int score;

    public Paddle(Phong pong, int paddleNumber) {
        this.paddleNumber = paddleNumber;
        if (paddleNumber == 1) {
            this.x = 0;
        }
        if (paddleNumber == 2) {
            this.x = pong.width - width;
        }
        this.y = pong.height / 2 - this.height / 2;
    }

}
