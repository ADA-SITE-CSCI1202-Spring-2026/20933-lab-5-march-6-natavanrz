public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square squ = (Square) obj;
            return width == squ.width;
        }
        return false;
    }
}