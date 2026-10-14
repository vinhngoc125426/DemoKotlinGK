import kotlin.math.*

fun main() {
    val math = 8.0
    val programming = 9.0
    val database = 7.5
    val total = math + programming + database

    val gpa = total / 3

    val maxScore = max(math, max(programming, database))

    val isPassed = gpa >= 5.0

    println("Tổng điểm: $total")
    println("Điểm trung bình (GPA): ${"%.2f".format(gpa)}")
    println("Điểm cao nhất: $maxScore")
    println("Kết quả: ${if (isPassed) "Đạt" else "Không đạt"}")
}

