public class Line{
    static class Point{
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static class CalculateLine{
        public static int distance(Point p1, Point p2){
            int dist = (p2.x-p1.x)+(p2.y-p1.y);
            return dist;
        }
        
    }
    public static void main(String[] args) {
        Point p1 = new Point(6, 9);
        Point p2 = new Point(5, 3);
        int dis = CalculateLine.distance(p1, p2);
        System.err.println(dis);
    }
}