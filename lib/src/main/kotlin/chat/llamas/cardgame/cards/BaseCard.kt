package chat.llamas.cardgame.cards

import chat.llamas.cardgame.CardTypes
import chat.llamas.cardgame.Regions
import chat.llamas.cardgame.UnitType

// Card represents the common type of everything.
// No matter what it is, it's a card or it's inside a card.
abstract class BaseCard {
    abstract  val cardType: CardTypes
    abstract  val unitType: UnitType
    abstract  val regionType: Regions
}