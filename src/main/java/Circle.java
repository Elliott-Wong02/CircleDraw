import java.awt.*;

public class Circle {
    private static int rad;
    private static Point pos;
    private static Color col;

    public Circle(Point initPos, Color col, int radius){
        rad = radius;
        pos = initPos;
        this.col = col;
    }
    public static void draw(Graphics g){
        g.setColor(col);
        g.fillOval(pos.x, pos.y, rad, rad);
    }
}
