package chat.llamas.cardgame.logic;

import chat.llamas.cardgame.TurnPhase;
import chat.llamas.cardgame.data.Game;
import chat.llamas.cardgame.data.Player;

public class TapHandlingTurnEventListener implements TurnEventListener {

    private Game game;
    public TapHandlingTurnEventListener(Game game) {
        this.game = game;
    }

    @Override
    public void onTurnEvent(Player player, TurnPhase turnPhase, boolean startOrEnd) {

    }
}
