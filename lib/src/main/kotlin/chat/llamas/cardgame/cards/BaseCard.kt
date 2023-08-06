package chat.llamas.cardgame.cards

import chat.llamas.cardgame.CardType

// Card represents the common type of everything.
// No matter what it is, it's a card or it's inside a card.
abstract class BaseCard {
    abstract val cardType: CardType
}