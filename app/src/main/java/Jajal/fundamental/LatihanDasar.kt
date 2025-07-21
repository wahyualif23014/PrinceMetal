package Jajal.fundamental




//pernyataan when

fun main() {
    val hari = 4
    val namaHari = when (hari) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        else -> "Hari libur"
    }
    println("Hari ke-$hari adalah $namaHari") // Output: Hari ke-3 adalah Rabu

    val nilai = 'A'
    when (nilai) {
        'A', 'B' -> println("Luar biasa!")
        'C' -> println("Bagus.")
        else -> println("Tingkatkan lagi.")
    }
}
//if else
//fun main() {
//    val nilai = 90
//    val keterangan: String
//    if (nilai > 75) {
//        println("Selamat, Anda lulus!")
//    } else {
//        println("Maaf, Anda perlu belajar lagi.")
//    }
//
//    val predikat = if (nilai > 90) {
//        "Sangat Baik"
//    } else if (nilai > 75) {
//        "Baik"
//    } else {
//        "Cukup"
//    }
//    println("Predikat Anda: $predikat")
//}



//fun sapaPengguna(nama: String, umur: Int){
//    println("
//    }
//}
//if else
//fun main() {
//    val nilai = 90
//    val keterangan: String
//    if (nilai > 75) {
//        println("Selamat, Anda lulus!")
//    } else {
//        println("Maaf, Anda perlu belajar lagi.")
//    }
//
//    val predikat = if (nilai > 90) {
//        "Sangat Baik"
//    } else if (nilai > 75) {
//        "Baik"
//    } else {
//        "Cukup"
//    }
//    println("Predikat Anda: $predikat")
//}



//fun sapaPengguna(nama: String, umur: Int){
//    println("halo $nama, umur anda $umur tahun")
//}
//fun hitungLuasPersegi(sisi: Int): Int {
//    return sisi * sisi
//}
//fun main() {
//    sapaPengguna("dewa", umur = 19)
//
//    val luas = hitungLuasPersegi(10)
//    val tinggi = hitungLuasPersegi(10)
//    println("Luas persegi adalah $luas")
//}




//Konsep Krusial - Null Safety
//fun main() {
//    // Variabel ini tidak boleh null, jika diisi null akan error
//    var namaPanggilan: String = "Budi"
//    // namaPanggilan = null // Ini akan langsung error!
//
//    // Untuk membuat variabel bisa bernilai null, tambahkan tanda tanya (?)
//    var namaTengah: String? = "Prakoso"
//    namaTengah = null // Ini boleh
//
//    // Cara mengakses variabel nullable dengan aman
//    // 1. Safe Call (?.)
//    println("Panjang nama tengah: ${namaTengah?.length}") // Jika namaTengah null, hasilnya null, bukan error.
//
//    // 2. Elvis Operator (?:)
//    val panjangNama = namaTengah?.length ?: 0 // Jika ekspresi di kiri null, gunakan nilai di kanan (0).
//    println("Panjang nama (dengan elvis): $panjangNama")
//}










//logika percabangan

//fun main() {
//    val nilaiUjian = 74
//
//    // Menggunakan if-else
//    val statusLulus: String
//    if (nilaiUjian > 75) {
//        statusLulus = "Lulus"
//    } else {
//        statusLulus = "Gagal"
//    }
//    println("Status kelulusan (if-else): $statusLulus")
//
//    // Cara lebih "Kotlin": if-else sebagai expression
//    val statusLulusModern = if (nilaiUjian > 75) {
//        "Lulus dengan baik"
//    } else {
//        "Perlu belajar lagi"
//    }
//    println("Status kelulusan (modern): $statusLulusModern")
//
//    // 'when' -> versi canggih dari switch-case
//    val grade: Char = 'A'
//    when(grade) {
//        'A' -> println("Luar Biasa!")
//        'B' -> println("Bagus!")
//        'C' -> println("Cukup.")
//        else -> println("Perlu perbaikan.")
//    }
//}

//tipe data
//fun main() {
//    // Data Diri Siswa Baru
//    val namaSiswa: String = "Citra Lestari"
//    val nisn: String = "51234567" // NISN lebih cocok String karena bisa diawali '0' dan tidak dihitung
//    val umurSiswa: Int = 16
//    val tinggiBadan: Double = 165.7
//    val kelas: Char = 'B'
//    var apakahAktif: Boolean = true
//
//    println("--- Profil Siswa ---")
//    println("Nama: $namaSiswa")
//    println("NISN: $nisn")
//    println("Umur: $umurSiswa tahun")
//    println("Tinggi: $tinggiBadan cm")
//    println("Masuk di kelas: 11-$kelas")
//    println("Status keaktifan: $apakahAktif")
//
//    // Siswa tersebut memutuskan untuk non-aktif sementara
//    apakahAktif = false
//    println("Status keaktifan terbaru: $apakahAktif")
//}