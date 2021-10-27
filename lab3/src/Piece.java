import java.util.Objects;

public abstract class Piece {
    private int value;
    private boolean isWhite;

    public Piece(int value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }

    public Piece(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public abstract void move() ;

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object Piece);
}
