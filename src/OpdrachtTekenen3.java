import java.awt.*;
import java.applet.*;

public class OpdrachtTekenen3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50,60,50,250);
        g.drawLine(60,60,60,250);
        g.drawLine(50,60,60,60);
        g.drawLine(50,250,60,250);
        g.setColor(Color.red);
        g.fillRect(60,60,200,20);
        g.drawRect(60,60,200,20);
        g.drawRect(60,80,200,20);
        g.setColor(Color.BLUE);
        g.fillRect(60,100,200,20);
        g.drawRect(60,100,200,20);
    }
}