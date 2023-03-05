
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {

    public ArrayList<Shape> shapes = new ArrayList<>();
    private Color color = Color.black;


    public void setColor(Color c) {
        this.color = c;
    }

    public Color getColor() {
        return this.color;
    }

    public void removeComponent(int x, int y){
        ArrayList<Shape> aux = new ArrayList<>();
        aux.addAll(shapes);
        for(Shape s: aux){
            if(s.contains(x, y)){
                this.shapes.remove(s);
            }
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        // Dibujar todas las formas en la lista
        Graphics2D g2d = (Graphics2D) g;
        for (Shape shape : shapes) {
            g2d.setColor(color);
            g2d.fill(shape);
        }
    }
}
