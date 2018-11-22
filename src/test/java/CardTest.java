import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

    Card card;
    Card anotherCard;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, Rank.EIGHT);
        anotherCard = new Card(SuitType.SPADES, Rank.JACK);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.EIGHT, card.getRank());
    }

    @Test
    public void canGetSuitFromAnotherCard(){
        assertEquals(SuitType.SPADES, anotherCard.getSuit());
    }

    @Test
    public void canGetRankFromAnotherCard(){
        assertEquals(Rank.JACK, anotherCard.getRank());
    }

    @Test
    public void queenHasValue10(){
        card = new Card(SuitType.HEARTS, Rank.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }

}