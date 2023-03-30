public class Point {
    private int x;
    private int y;

    public void Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean equals(){
        if (x == y)
            return true;
        else return false;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
