package db;
public class MyPoint
{
 private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String toString() {
        System.out.println("("+ x +","+ y + ")");
        return null;
    }
}