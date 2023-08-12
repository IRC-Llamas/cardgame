package chat.llamas.cardgame.data;

import chat.llamas.cardgame.cards.CostType;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class Cost {

    private final Map<CostType, Integer> cost;

    private Cost(Map<CostType, Integer> cost) {
        this.cost = ImmutableMap.copyOf(cost);
    }

    public Map<CostType, Integer> getCost() {
        return cost;
    }

    public Integer getCost(CostType costType) {
        return cost.getOrDefault(costType, -1);
    }
}
