import javax.swing.*;

public class Main extends JFrame {

    public Main(){
        setTitle("Snake Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640,690);
        setLocation(600,600);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}