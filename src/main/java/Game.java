import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;

    public Game(){
        this.players = new ArrayList<>();
    }

    //method create player(name)
    //push a player to the array

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player calculateWinner(){
        Player winner = getPlayers().get(0);
        for (int i = 0; i < this.players.size() ; i++) {
            if(getPlayers().get(i).getCardValue() >= winner.getCardValue()){
                winner = getPlayers().get(i);
            }
        }
        return winner;
    }




}
