import processing.core.PApplet;

class Circle {
    public static final int DIAMETER = 10;
    private final float horizontalSpeed;
    private final float verticalPosition;


    Circle(float HorizontalSpeed, float verticalPosition) {
        this.horizontalSpeed = HorizontalSpeed;
        this.verticalPosition = verticalPosition;
    }

    public void drawCircle(PApplet P) {
        P.ellipse(TryProcessing.positionOnXAxis * this.horizontalSpeed, this.verticalPosition, DIAMETER, DIAMETER);
    }
}