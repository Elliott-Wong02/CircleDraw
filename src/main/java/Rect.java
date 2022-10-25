import java.awt.*;

public class Rect {
    private static int wid;
    private static int hei;
    private static Point pos;
    private static Color col;

    public Rect(Point initPos, Color col, int width, int height){
        wid = width;
        hei = height;
        pos = initPos;
        this.col = col;
    }
    public static void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x, pos.y, wid, hei);
    }
}