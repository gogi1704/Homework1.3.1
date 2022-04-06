const val seconds: Int = 35432

fun main() {

    println(agoToText())

}



fun agoToText(): String {

    return when (seconds) {
        in 0..60 -> "был(а) только что"  //минута
        in 61..(60 * 60) -> helpWithEndingMinutes() // от 1 до 60 минут
        in (60 * 60 + 1)..(60 * 60 * 24) -> helpWithEndingHours()  //от часа до суток
        in (60 * 60 * 24 + 1)..(60 * 60 * 24 * 2) -> " был(а) в сети сегодня"
        in (60 * 60 * 24 *2 + 1)..(60 * 60 * 24 * 3) -> " был(а) в сети вчера"
        else -> " был(а) в сети давно"
    }
}

fun helpWithEndingMinutes(): String {
    val minutes: Int = seconds / 60
    if (minutes == 1 || minutes % 10 == 1) {
        return "был(а) в сети $minutes минуту назад"
    } else if (minutes == 2 || minutes % 10 == 2 || minutes == 3 || minutes % 10 == 3 || minutes == 4 || minutes % 10 == 4) {
        return "был(а) в сети $minutes минуты назад"
    } else
        return "был(а) в сети $minutes минут назад"
}

fun helpWithEndingHours(): String {
    val hours: Int = seconds / 60 / 60
    if (hours == 1 || hours % 10 == 1) {
        return "был(а) в сети $hours час назад"
    } else if (hours == 2 || hours % 10 == 2 || hours == 3 || hours % 10 == 3 || hours == 4 || hours % 10 == 4) {
        return "был(а) в сети $hours часа назад"
    } else
        return "был(а) в сети $hours часов назад"

}
