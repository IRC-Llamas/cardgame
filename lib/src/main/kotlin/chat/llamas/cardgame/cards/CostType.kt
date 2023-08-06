package chat.llamas.cardgame.cards

enum class CostType {
    // INDUSTRIAL cost requires an IndustrialValue card
    // to pay its value.
    INDUSTRIAL,
    // SCIENCE cost requires a ScienceValue card
    // to pay its value.
    SCIENCE,
    // LEADERSHIP cost requires a LeadershipValue card
    // to pay its value.
    LEADERSHIP,
    // WEIGHT represents the cost towards military capacity
    // that a card requires to remain sustained.
    WEIGHT
}