package chat.llamas.cardgame.cards;

import chat.llamas.cardgame.CardType;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class CostCard extends BaseCard {

    private final Map<CostType, Integer> costMap;

    private CostCard(Map<CostType, Integer> costMap) {
        this.costMap = costMap;
    }
    public static CostCard create(Map<CostType, Integer> costMap) {
        retun new CostCard(costMap);
    }
    public int getCost(CostType costType) {
        return costMap.get(costType);
    }
    @NotNull
    @Override
    public CardType getCardType() {
        return CardType.Enhancement;
    }
}
