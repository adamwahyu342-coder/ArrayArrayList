package bagian3.perpus;

public class mainperpustakaan {
public static void main(String[] args) {
// Membuat objek pengelola
perpustakaan perpus = new perpustakaan();
// Membuat objek Buku lalu memasukkannya ke koleksi
perpus.tambahBuku(new buku("Laskar Pelangi", "Andrea Hirata"));
perpus.tambahBuku(new buku("Bumi Manusia", "Pramoedya"));
perpus.tambahBuku(new buku("Negeri 5 Menara", "Ahmad Fuadi"));
perpus.tampilkanKoleksi();
System.out.println();
perpus.pinjamBuku("Bumi Manusia");
perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali
System.out.println();
perpus.tampilkanKoleksi();
System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
}
}