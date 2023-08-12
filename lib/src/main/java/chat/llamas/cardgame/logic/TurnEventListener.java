package chat.llamas.cardgame.logic;

import chat.llamas.cardgame.TurnPhase;
import chat.llamas.cardgame.data.Player;

public interface TurnEventListener {

    public void onTurnEvent(Player player, TurnPhase turnPhase, boolean startOrEnd);
}
