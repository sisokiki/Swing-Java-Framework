import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("rocket.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();

    Point imageCorner;
    Point prevPt;

    DragPanel() {
        imageCorner = new Point(0, 0);

        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();

        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this, g, imageCorner.x, imageCorner.y);
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();

            int dx = currentPt.x - prevPt.x;
            int dy = currentPt.y - prevPt.y;

            imageCorner.translate(dx, dy);
            prevPt = currentPt;

            repaint();
        }
    }
}
