package chat.llamas.cardgame

abstract class BaseCard {
    abstract  val cardType: CardTypes
    abstract  val unitType: UnitType
    abstract  val regionType: Regions
}