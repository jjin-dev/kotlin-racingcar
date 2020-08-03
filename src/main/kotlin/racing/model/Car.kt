package racing.model

data class Car(val name: String, val raceHistory: MutableList<Int>) {
    fun saveResultOfTurn(resultOfTurn: Int) {
        raceHistory.add(resultOfTurn)
    }

    fun isIn(position: Int) = this.raceHistory.sum() == position
}
