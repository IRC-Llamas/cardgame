package chat.llamas.cardgame.data;

import chat.llamas.cardgame.cards.CardTemplate;

import java.util.List;

public class GameState {

    private List<CardTemplate> cards;
}
class GamePlayerState {
    private final Player player;

    private long industrialResource;

    private long scienceResource;

    //private long

    public GamePlayerState(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}