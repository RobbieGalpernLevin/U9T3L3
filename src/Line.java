import java.awt.Graphics;

public class Line extends Shape
{
    public Line()
    {
        super();
    }

    public void draw(Graphics graphic)
    {
        graphic.setColor(getColor4());
        graphic.drawLine(getP1().x, getP1().y, getP2().x, getP2().y);
    }
}
