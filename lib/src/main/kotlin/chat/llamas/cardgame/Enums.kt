package chat.llamas.cardgame

enum class CardType {
    Unit,
    Enhancement,
    Stationary,
    Leader,
    Tactical,
    Action,
    Region,
    Border,
    Weather,
    Tap

};
enum class TurnPhase {
    Initial,
    Tactical,
    Final
};
enum class UnitType {
    Land,
    Air,
    Sea
}
enum class WeatherType {
    Clear,
    Cloudy,
    Rainy,
    Thunderstorm
}