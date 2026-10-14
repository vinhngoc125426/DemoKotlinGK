fun main() {
    val name = "Nguyen Van A"
    var age = 20
    val gpa = 8.5
    val passed = true

    println("Giá trị ban đầu")
    println("Tên: $name")
    println("Tuổi: $age")
    println("GPA: $gpa")
    println("Đậu: $passed")

    // 2. Thay đổi age và in lại
    age = 21
    println("\n--- Sau khi đổi tuổi ---")
    println("Tuổi mới: $age")

    // 3. Thử thay đổi name
    //name = "Nguyen Van B" // vì khai báo val name chỉ read only
}

