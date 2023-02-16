public class Square implements Comparable<Square>{
    int width;
    int height;
    public Square(int width, int height){
        this.height = height;
        this.width = width;
    }
    public static int Perimeter (int width, int height){
        return (width*2)+(2*height);
    }

    public int compareTo (Square square) {
        if (Perimeter(this.width,this.height) > Perimeter(square.width, square.height)){
            return 1;
        }
        else return -1;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
