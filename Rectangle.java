import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;

public class Rectangle extends JPanel {
    public Rectangle(Color color, int size) {
        super();
        this.setBackground(color);
        //this.setOpaque(true);
        this.setMinimumSize(new Dimension(size, size));
        this.setMaximumSize(new Dimension(size, size));
        this.setPreferredSize(new Dimension(size, size));
    }
}
