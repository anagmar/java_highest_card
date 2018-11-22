import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Card card;
    Deck deck;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, Rank.EIGHT);
        deck = new Deck();
    }

    @Test
    public void populateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.getCards().size());
    }
}
