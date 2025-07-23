package Jajal.fundamental


//try-catch
fun main() {
    val inputAngka = "123x" // Input yang sengaja salah

    try {
        val angka = inputAngka.toInt()
        println("Angka yang valid: $angka")
    } catch (e: NumberFormatException) {
        println("Input '$inputAngka' bukan angka yang valid!")
    } finally {
        println("Proses validasi selesai.")
    }
}
//OOP
//class Persegi (val sisi: Int) {
//    fun hitungLuas(): Int {
//        return sisi * sisi
//    }
//    fun sapa() {
//        println("halo, aku persegi $sisi")
//
//    }
//}
//
//fun main () {
//    val persegiA = Persegi(sisi = 10)
//    val persegiB = Persegi(sisi = 12)
//
//    println("luas persegi A : ${persegiA.hitungLuas()}")
//    persegiB.sapa()
//}

//loops
//fun main () {
//    val daftarBuah = listOf("apel", "jeruk" ,"mangga")
//    for (buah in daftarBuah) {
//        println("saya suka buah $buah")
//    }
//    println("\n menghitung daftar 1 sampai 5:")
//    for (i in 1..5) {
//        println("$i dan $daftarBuah")
//    }
//}

////koleksi data
//fun main() {
//    // List (Daftar)
//    val daftarNama: List<String> = listOf("Ani", "Budi", "Candra", "Ani")
//    println("Nama pertama: ${daftarNama[0]}")
//    println("Seluruh nama: $daftarNama")
//
//    // Set (Himpunan)
//    val nomorUnik: Set<Int> = setOf(1, 2, 3, 4, 3, 2)
//    println("Nomor unik: $nomorUnik") // Output: [1, 2, 3, 4]
//
//    // Map (Peta)
//    val ibukota: Map<String, String> = mapOf(
//        "Indonesia" to "Jakarta",
//        "Jepang" to "Tokyo"
//    )
//    println("Ibukota Indonesia adalah ${ibukota.getValue("Indonesia")}")
//}
// null safety

//fun main () {
//    var nama : String = "Budi"
//
//    var alamat :String? = "jakarta"
//    alamat = null
//    println("Panjang alamat : ${alamat?.length}")
//
//    val panjangAlamat = alamat?.length ?: 0
//    println("panjang alamat $panjangAlamat")
//
//}

//pernyataan when
//
//fun main() {
//    val hari = 4
//    val namaHari = when (hari) {
//        1 -> "Senin"
//        2 -> "Selasa"
//        3 -> "Rabu"
//        4 -> "Kamis"
//        5 -> "Jumat"
//        else -> "Hari libur"
//    }
//    println("Hari ke-$hari adalah $namaHari") // Output:
//
//    val nilai = 'A'
//    when (nilai) {
//        'A', 'B' -> println("Luar biasa!")
//        'C' -> println("Bagus.")
//        else -> println("Tingkatkan lagi.")
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
//    var namaPanggilan: String = "Budi"
//    // namaPanggilan = null // Ini akan langsung error!
//
//    var namaTengah: String? = "Prakoso"
//    namaTengah = null // Ini boleh
//
//    // Cara mengakses variabel nullable dengan aman
//    // 1. Safe Call (?.)
//    println("Panjang nama tengah: ${namaTengah?.length}")
//    // 2. Elvis Operator (?:)
//    val panjangNama = namaTengah?.length ?: 0
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
//    val statusLulusModern = if (nilaiUjian > 75) {
//        "Lulus dengan baik"
//    } else {
//        "Perlu belajar lagi"
//    }
//    println("Status kelulusan (modern): $statusLulusModern")
//
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
//    val nisn: String = "51234567"
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
//    apakahAktif = false
//    println("Status keaktifan terbaru: $apakahAktif")
//}