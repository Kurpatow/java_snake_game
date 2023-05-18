import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameField extends JPanel implements ActionListener {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot1;
    private Image dot2;
    private Image apple;
    private int apX;
    private int apY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;

    public GameField() {
        setBackground(Color.gray);
        loadImages();
    }

    public void initGame(){
        dots = 3;
        for (int i = 0; i < dots; i++){
            x[i] = 48 - i * DOT_SIZE;
            y[i] = 48;
        }
        timer = new Timer(250,this);
        timer.start();
        createApple();
    }

    public void createApple(){
        apX = new Random().nextInt(20) * DOT_SIZE;
        apY = new Random().nextInt(20) * DOT_SIZE;
    }

    public void loadImages() {
        ImageIcon iia = new ImageIcon("apple.png");
        apple = iia.getImage();
        ImageIcon iid1 = new ImageIcon("dot1.png");
        dot1 = iid1.getImage();
        ImageIcon iid2 = new ImageIcon("dot2.png");
        dot2 = iid2.getImage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame){

        }
    }
}