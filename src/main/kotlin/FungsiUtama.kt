fun main() {
    println("Swazdo-lah, Tenno!")

    //
    val buku=4
    if (buku>3) println("tumpukan buku") else println("buku trilogi")

    //
    println(JudulBuku.bukuBiru)
    println(JudulBuku.bukuMerah)
    println(JudulBuku.bukuCoklat)
    println(JudulBuku.BUKU_A4)

    //
    val angkaPertama=2
    val angkaKedua=4
    println(jumlah(angkaPertama,angkaKedua))

    //
    val namaBuku="hidayah memes"
    when(namaBuku){
        "hidayah memes"->"keasyikan gacha, seorang pemuda harus nunggu rate up untuk ke surga"
        "majalah coklat"->"toko roti jalan 123 baru saja dibuka"
    }
    println(namaBuku)



}
//
fun jumlah(angka1:Int,angka2:Int)=angka1+angka2

//
enum class JudulBuku(warnaBuku:String){
    bukuBiru("Buku panduan kampus"),
    bukuMerah("buku iqra jilid 5"),
    bukuCoklat("buku tulis "),
    BUKU_A4("buku isi 30 halaman")
}

