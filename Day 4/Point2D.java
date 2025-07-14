public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y)
     {
        this.x = x;
        this.y = y;
    }

    public double getX() {
         return x; }

    public double getY() {
         return y; }
         

    public void setX(double x) {
         this.x = x; }

    public void setY(double y) {
         this.y = y; }


    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    public double distance(Point2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
