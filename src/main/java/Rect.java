import java.awt.*;

public class Rect {
    private int wid;
    private int hei;
    private Point pos;
    private Color col;

    public Rect(Point initPos, Color col, int width, int height){
        wid = width;
        hei = height;
        pos = initPos;
        this.col = col;
    }
    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x, pos.y, wid, hei);
    }
}