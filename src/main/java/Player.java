import java.util.ArrayList;

public class Player {

    private ArrayList<Card> myCards;

    public Player(){
        this.myCards = new ArrayList<>();
    }

    public ArrayList<Card> getMyCards() {
        return myCards;
    }

    public void dealToPlayer(Card card) {
        this.myCards.add(card);
    }

    public double getCardValue(){
        return this.myCards.get(0).getRank().getValue();
    }
}
