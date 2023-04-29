import kotlin.math.roundToInt

fun main() {
    val amount = 12_002
    val commissionPercentage = 0.75
    val minCommission = 35

    var commissionAmount = ((amount * commissionPercentage) / 100).roundToInt()
    if (commissionAmount < minCommission) commissionAmount = minCommission

    println("Комиссия составит: $commissionAmount руб.")
}