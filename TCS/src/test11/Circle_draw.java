package test11;



import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
 
public class Circle_draw extends JFrame 
{
    public Circle_draw()
    {
        setTitle("Tutorial");
        setSize(960,960);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.drawOval(480,480,200,200);
        g.fillOval(480, 480, 200, 200);
    }
 
    public static void main(String args[])
    {
        Circle_draw t = new Circle_draw();
        t.paint(null);
    }
}
