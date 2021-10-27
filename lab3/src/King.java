public class King extends Piece{
    public King(int value, boolean isWhite) {
        super(value, isWhite);
    }

    public King(int value) {
        super(1000);
    }

    @Override
    public void move() {
        System.out.println("One square");
    }

    @Override
    public String toString() {
        return "King{value='" + getValue() +
                "', isWhite='" + isWhite() + '\'' + '}';
    }

    public boolean equals(Object Piece) {
        if( isWhite() && Piece.equals(getValue())){
            return true;
        }return false;
    }
}
