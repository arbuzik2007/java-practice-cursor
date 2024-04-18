import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class CursorViewPanel extends JPanel implements MouseMotionListener {
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        final int x = e.getX();
        final int y = e.getY();
        // only display a hand if the cursor is over the window
        final Rectangle cellBounds = this.getBounds();
        if (cellBounds.contains(x, y)) {
            this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        } else {
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }
}
