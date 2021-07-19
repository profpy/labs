import java.awt.Color;

// TODO
// import the mazes..!

public class TurtleDemo {
    public static void main(String[] args) {
        Turtle t1 = new Turtle();
        t1.move(100);
        t1.setAngle(90);
        t1.move(100);
        t1.setColor(Color.red);
        t1.move(100);
        t1.setColor(Color.pink);
        t1.move(100);
        Turtle t2 = new Turtle();
        t2.moveTo(100,100, 0);
        t2.drawCircle(100);
        Turtle t3 = new Turtle();
        t3.fillCircle(100);
    }
}
