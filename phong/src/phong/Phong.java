package phong;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Phong implements ActionListener, KeyListener{
    
    public static Phong pong;
    public int width = 700, height = 700;
    public Renderer renderer;
    public Paddle player1, player2;
    public Ball ball;
    public boolean bot = false, selectingDifficulty;
    public boolean w, s, up, down;
    public int gameStatus = 0, scoreLimit = 7, playerWon;
    public int botDifficulty, botMoves, botCooldown = 0;
    public Random random;
    public JFrame jframe;
    
    public Phong(){
        Timer timer = new Timer(20, this);
        random = new Random();
        jframe = new JFrame("Pong");
        renderer = new Renderer();
        jframe.setSize(width + 15, height +15);
        jframe.setVisible(true);
        jframe.add(renderer);
        jframe.addKeyListener(this);
        
        timer.start();
    }
    
    public void start(){
        gameStatus = 2;
        player1 = new Paddle(this, 1);
        player2 = new Paddle(this, 2);
        ball = new Ball(this);
    }
    
    public void update(){
        
    }
    
    public void render(Graphics2D g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if(gameStatus == 0){
            g.setColor(Color.WHITE);
            g.setFont(new Font("Times New Roman", 1, 30));
            g.drawString("PONG", width / 2 - 75, 50);
            if (!selectingDifficulty) {
                g.drawString("Press Space to Play", width / 2 - 150, height / 2 - 25);
                g.drawString("Press Shift to Play with Bot", width / 2 - 200, height / 2 + 25);
                g.drawString("<< Score Limit: " + scoreLimit + " >>", width / 2 - 150, height / 2 + 75);
            }
            if (selectingDifficulty) {
                String string = botDifficulty == 0 ? "Easy" : (botDifficulty == 1 ? "Medium" : "Hard");
                g.setFont(new Font("Times New Roman", 1, 30));
                g.drawString("<< Bot Difficulty: " + string + " >>", width / 2 - 180, height / 2 - 25);
                g.drawString("Press Space to Play", width / 2 - 150, height / 2 + 25);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
