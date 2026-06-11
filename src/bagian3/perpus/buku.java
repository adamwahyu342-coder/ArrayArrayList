package bagian3.perpus;
public class buku {
// Atribut: data yang dimiliki setiap buku
private final String judul;
private final String penulis;
private boolean dipinjam;
// Constructor: dipanggil saat objek dibuat
public buku(String judul, String penulis) {
this.judul = judul;
this.penulis = penulis;
this.dipinjam = false; // buku baru dianggap tersedia
}
// Getter: cara membaca atribut dari luar class
public String getJudul() {
    return judul;
}
public String getPenulis() {
return penulis;
}
public boolean isDipinjam() {
return dipinjam;
}
// Method untuk mengubah status pinjam
public void setDipinjam(boolean dipinjam) {
this.dipinjam = dipinjam;
}
// Mengembalikan keterangan buku dalam bentuk teks
public String info() {
String status = dipinjam ? "Dipinjam" : "Tersedia";
return judul + " oleh " + penulis + " [" + status + "]";
}
}