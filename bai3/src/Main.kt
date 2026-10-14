fun classGpa(gpa: Double): String {
    return when {
        gpa >= 8.5 -> "Excellent"
        gpa >= 7.0 -> "Good"
        gpa >= 5.0 -> "Pass"
        else -> "Fail"
    }
}

fun main() {
    val gpaList = listOf(9.2, 8.5, 7.4, 5.0, 3.8)

    println("--- KẾT QUẢ PHÂN LOẠI GPA ---")
    for (gpa in gpaList) {
        val result = classGpa(gpa)
        println("GPA: $gpa -> $result")
    }
}