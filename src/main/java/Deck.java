import java.util.ArrayList;

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


//shuffle

//deal 1 card (splice or something?)

    //deal 1 card to each player
    //compare the values, highest wins


}
