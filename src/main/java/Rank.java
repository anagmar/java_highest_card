public enum Rank {
    ACE(11.0),
    TWO(2.0),
    THREE(3.0),
    FOUR(4.0),
    FIVE(5.0),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10.1),
    QUEEN(10.2),
    KING(10.3);

    private final double value;

    Rank(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }
}

