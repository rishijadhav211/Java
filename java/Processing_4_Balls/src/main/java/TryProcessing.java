import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int HEIGHT = 500;
    public static final int WIDTH = 500;
    public static int positionOnXAxis =1;

    /*
    shared with all circle so declared in parent class,also can not be declared in nested class
*/

    Circle circle1;
    Circle circle2;
    Circle circle3;
    Circle circle4;


    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        final int SPEED_OF_CIRCLE1 = 1;
        final float verticalPosition1 = (float) HEIGHT / 5;
        circle1 = new Circle(SPEED_OF_CIRCLE1, verticalPosition1);

        final int SPEED_OF_CIRCLE2 = 2;
        final float verticalPosition2 = ((float) HEIGHT / 5) * 2;
        circle2 = new Circle(SPEED_OF_CIRCLE2, verticalPosition2);

        final int SPEED_OF_CIRCLE3 = 3;
        final float verticalPosition3 = ((float) HEIGHT / 5) * 3;
        circle3 = new Circle(SPEED_OF_CIRCLE3, verticalPosition3);

        final int SPEED_OF_CIRCLE4 = 4;
        final float verticalPosition4 = ((float) HEIGHT / 5) * 4;
        circle4 = new Circle(SPEED_OF_CIRCLE4, verticalPosition4);
    }

    @Override
    public void draw() {
        circle1.drawCircle(this);
        circle2.drawCircle(this);
        circle3.drawCircle(this);
        circle4.drawCircle(this);
        positionOnXAxis++;
    }
}
