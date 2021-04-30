import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
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
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    private class Rectangle extends JPanel {
        public Rectangle(Color color, int size) {
            super();
            this.setBackground(color);
            this.setOpaque(true);
            this.setMinimumSize(new Dimension(size, size));
            this.setMaximumSize(new Dimension(size, size));
            this.setPreferredSize(new Dimension(size, size));
        }
    }

    private JPanel createSquareJPanel(Color color, int size) {
        Rectangle rect = new Rectangle(color, size);
        return rect;
    }
}