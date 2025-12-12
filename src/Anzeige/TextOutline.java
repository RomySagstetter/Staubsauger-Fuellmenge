package Anzeige;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;

public class TextOutline extends JPanel {

    private String text = "";
    private boolean outlineEnabled = true;
    private Color color;
    private int size = 60;
    
    public TextOutline() {
		color = Color.black;
	}

    public void setText(String t) {
        this.text = t;
        repaint(); // neu zeichnen
    }

    public void setOutlineEnabled(boolean enabled) {
        this.outlineEnabled = enabled;
        repaint();
    }
    
    public void setColor(Color c) {
    	color = c;
    }
    
    public void setTextSize(int s) {
    	size = s;
    }

    @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        if (text == null || text.isEmpty()) return;

        Font font = new Font("Arial", Font.BOLD, size);
        g2.setFont(font);

        TextLayout layout = new TextLayout(text, font, g2.getFontRenderContext());
        Rectangle bounds = layout.getPixelBounds(null, 0, 0);

        // Berechnung der zentrierten Position
        float x = (getWidth() - bounds.width) / 2f - bounds.x;
        float y = (getHeight() - bounds.height) / 2f - bounds.y;

        Shape outline = layout.getOutline(AffineTransform.getTranslateInstance(x, y));

        if (outlineEnabled) {
            // Outline
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(3));
            g2.draw(outline);
        }

        // Füllfarbe (braucht Outline nicht)
        g2.setColor(color);
        g2.fill(outline);
    }
}
