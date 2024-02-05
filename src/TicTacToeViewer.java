import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class

    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private Image[] shapes;
    public TicTacToeViewer(TicTacToe board) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("TicTacToe");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);

        shapes[0] = new ImageIcon("Resources/O.png").getImage();
        shapes[1] = new ImageIcon("Resources/X.png").getImage();
    }

    public Image[] getImages() {
        return shapes;
    }
    public void paint (Graphics g) {
        g.setColor(Color.black);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                g.drawRect(j * 200 + 150, i * 200 + 100, 200, 200);
            }
        }

        g.setFont(new Font ("Serif", Font.ITALIC, 20));
        g.setColor(Color.RED);
        for (int i = 0; i < 3; i++) {
            String str = Integer.toString(i);
            g.drawString(str, 250 + (200 * i), 75);
        }

        for (int i = 0; i < 3; i++) {
            String str = Integer.toString(i);
            g.drawString(str, 100, 200 + (200 * i));
        }
    }
}
