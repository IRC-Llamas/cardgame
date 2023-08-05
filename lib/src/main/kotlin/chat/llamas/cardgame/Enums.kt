package chat.llamas.cardgame

enum class CardTypes {
    UNIT_CARD,
    ENHANCEMENT_CARD,
    STATIONARY_CARD,
    LEADER_CARD,
    TACTICAL_CARD,
    ACTION_CARD,
    REGION_CARD,
    WEATHER_CARD;

};

enum class UnitType {
    Land,
    Air,
    Sea
}
enum class WeatherType {
    CLEAR,
    CLOUDY,
    RAINY,
    THUNDERSTORM
}