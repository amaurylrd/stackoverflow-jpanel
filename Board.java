import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;

public class Board extends JFrame  {
    public Board() {
        super();
        add(this.createContentPane());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JPanel createContentPane () {
        JPanel totalGUI = new JPanel();
        JPanel mainPanel = new JPanel(new GridLayout(3, 3));
        

        JPanel red = createSquareJPanel(Color.red, 50);
        JPanel blue = createSquareJPanel(Color.blue, 50);
          
        mainPanel.add(red);
        mainPanel.add(blue);
        
        totalGUI.add(mainPanel);
        return totalGUI;
    }

    private JPanel createSquareJPanel(Color color, int size) {
        Rectangle rect = new Rectangle(color, size);
        return rect;
    }
}
