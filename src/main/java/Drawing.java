import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Drawing extends Canvas{
    Point p = new Point(200, 200);
    Color c = new Color(0x992266);
    Point p_2 = new Point(0, 0);
    Color c_2 = new Color(49,27,59);
    private Circle O = new Circle(p, c, 200);
    private Rect R = new Rect(p_2, c_2, 100, 200);
    private Frame f;
    public Drawing(){
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
        setBackground(Color.WHITE);
        setSize(400, 400);
    }
    public void paint(Graphics g){
        O.draw(g);
        R.draw(g);
    }
}
