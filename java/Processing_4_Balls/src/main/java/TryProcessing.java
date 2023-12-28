import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int HEIGHT = 500;
    public static final int WIDTH = 500;
    public static final int DIAMETER = 10;
    public static int horizontalPosition =1;
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
        circle1 = new Circle(1, (float) HEIGHT / 5);
        circle2 = new Circle(2, ((float) HEIGHT / 5) * 2);
        circle3 = new Circle(3, ((float) HEIGHT / 5) * 3);
        circle4 = new Circle(4, ((float) HEIGHT / 5) * 4);
    }

    @Override
    public void draw() {
        circle1.display();
        circle2.display();
        circle3.display();
        circle4.display();
        horizontalPosition++;
    }

    class Circle {
        private final float  horizontalSpeed;
        private final float verticalPosition;

        Circle(float HorizontalSpeed, float verticalPosition) {
            this.horizontalSpeed=HorizontalSpeed;
            this.verticalPosition = verticalPosition;
        }

        void display() {
            drawCircle();
        }

        private void drawCircle() {
            ellipse(TryProcessing.horizontalPosition * this.horizontalSpeed, verticalPosition, DIAMETER, DIAMETER);
        }
    }
}
