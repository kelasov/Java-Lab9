package Pr9;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    JButton but;
    Shape c;
    public Window () {
        but = new JButton("push");
        setSize (new Dimension (700, 600));
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        but.setSize(100, 20);
        container.add(but);
        but.addMouseListener(new Mouse(this));
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setVisible (true);
    }
    public void paint(Graphics g) {
        Random random = new Random();
        for (int i = 0; i<20; i++) {
            c = new Rectangle(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)),
                    random.nextInt(getPreferredSize().width), random.nextInt(getPreferredSize().height),
                    random.nextInt(100), random.nextInt(100));
            c.paint(g);
        }
    }

    public static void main (String [] args) {
        Window w = new Window();
    }
}
