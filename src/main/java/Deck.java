import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void populateDeck() {

        for(SuitType suitType : SuitType.values()){
            for(Rank rank : Rank.values()){
                Card card = new Card(suitType, rank);
                cards.add(card);
            }
        }
    }

    public Card dealCard() {
        Collections.shuffle(this.cards);
        return this.cards.remove(0);
    };




}
