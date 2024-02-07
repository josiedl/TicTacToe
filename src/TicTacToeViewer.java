import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class

    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 500;
    private Image[] shapes;
    private TicTacToe board;
    public TicTacToeViewer(TicTacToe board) {
        this.board = board;
        shapes = new Image[2];
        shapes[0] = new ImageIcon("Resources/O.png").getImage();
        shapes[1] = new ImageIcon("Resources/X.png").getImage();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("TicTacToe");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public TicTacToe getBoard() {
        return board;
    }
    public Image[] getImages() {
        return shapes;
    }
    public void paint (Graphics g) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                g.drawRect(100 + (100 * i), 100 + (100 * j), 100, 100);
            }
        }

        if (board.getBoard()[0][0] != null) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board.getBoard()[i][j].draw(g);
                }
            }
        }

        if (board.getGameOver()) {
            g.setFont(new Font("Serif", Font.BOLD, 50));
            g.setColor(Color.BLACK);
            if (board.checkTie()) {
                g.drawString("It's a Tie!", 130, 450);
            }
            else {
                g.drawString(board.getWinner() + " Wins", 175, 450);
            }
        }

        g.setFont(new Font ("Serif", Font.ITALIC, 20));
        g.setColor(Color.RED);
        for (int i = 0; i < 3; i++) {
            String str = Integer.toString(i);
            g.drawString(str, 150 + (100 * i), 80);
        }

        for (int i = 0; i < 3; i++) {
            String str = Integer.toString(i);
            g.drawString(str, 70, 150 + (100 * i));
        }
    }
}
