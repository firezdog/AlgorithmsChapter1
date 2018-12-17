import StdDraw;

public class Drawing 
{
    static void drawCurves()
    {
        int N = 100;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N);
        StdDraw.setPenRadius(0.01);
        for (int i = 1; i <= N; i++)
        {
            StdDraw.point(i,i);
            StdDraw.point(i, i*i);
            StdDraw.point(i, i*Math.log(i));
        }
    }

    public static void main(String[] args) {
        drawCurves();
    }

}