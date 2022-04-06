const val vkPay = " Vk pay"
const val maestro = " Maestro"
const val masterCard = " Master Card"
const val visa = " Visa"
const val mir = " Mir"

const val mcAndMaestroCommision = 0.06
const val visaAndMirCommision = 0.075

fun main() {

    println(calcComission(cardType = masterCard , sumPay = 200_00))

}

fun calcComission(cardType: String = vkPay, totalAmountFroamMonth: Int = 0, sumPay: Int): Int {
    var commission = 0
    when (cardType) {
        maestro, masterCard -> commission =
            if (sumPay > (300 * 100) && sumPay < (75_000 * 100)) {
                0
            } else (sumPay * mcAndMaestroCommision + (20 * 100)).toInt()
        visa, mir -> {
            commission = (sumPay * visaAndMirCommision).toInt()
            if (commission < (35 * 100)) {
                commission = 3500
            }
        }
        vkPay -> {
            commission = 0
        }

    }
    return commission
}