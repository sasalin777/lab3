public class Knight extends Piece{

    public Knight(int value, boolean isWhite) {
        super(value, isWhite);
    }

    public Knight(int value) {
        super(2);
    }
    public Knight() {
        super(2);
    }

    @Override
    public void move() {
        System.out.println("Like an L");
    }

    @Override
    public String toString() {
        return "Knight{value='" + getValue() +
                "', isWhite='" + isWhite() + '\'' + '}';
    }
    public boolean equals(Object Piece) {
        if( isWhite() && Piece.equals(getValue())){
            return true;
        }return false;
    }
}
