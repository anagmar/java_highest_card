import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Deck deck;

    @Before
    public void before(){
        game = new Game();
        player1 = new Player() ;
        player2 = new Player() ;
        deck = new Deck();
    }

    @Test
    public void dealCardToPLayer(){
        deck.populateDeck();
        player1.dealToPlayer(deck.dealCard());
        player1.dealToPlayer(deck.dealCard());
        assertEquals(1,player1.getMyCards().size());
    }

    @Test
    public void highCardWins(){
        player1.getMyCards().clear();
        player2.getMyCards().clear();
        deck.populateDeck();
        player1.dealToPlayer(deck.dealCard());
        player2.dealToPlayer(deck.dealCard());
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.calculateWinner();
        assertEquals(1,player1.getMyCards().size());
    }
}

