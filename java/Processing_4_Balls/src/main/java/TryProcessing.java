import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int HEIGHT = 500;
    public static final int WIDTH = 500;
    public static final int DIAMETER = 10;

    int x=1;
    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {

        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
        x++;
    }
    

    private void drawCircle1() {

        ellipse(x,HEIGHT/5, DIAMETER,DIAMETER);
    }
    private void drawCircle2() {
        ellipse(x*2,(HEIGHT/5)*2,DIAMETER,DIAMETER);
    }
    private void drawCircle3() {
        ellipse(x*3,(HEIGHT/5)*3,DIAMETER,DIAMETER);
    }
    private void drawCircle4() {
        ellipse(x*4,(HEIGHT/5)*4,DIAMETER,DIAMETER);
    }
}
