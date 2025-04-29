package Jobsheet9;
import java.util.Scanner;
public class SuratDemo20 {
    public static void main(String[] args) {
        StackSurat20 stack = new StackSurat20(5);
        Scanner sc = new Scanner(System.in);
        int pilih;
        int idCount = 1;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (I/S): ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    String idSurat = String.valueOf(idCount++);
                    Surat20 surat = new Surat20(idSurat, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.printf("Surat %s berhasil dikumpulkan\n", nama);
                    break;
                case 2:
                    Surat20 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.printf("Surat dari %s telah diproses.\n", diproses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat20 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukan nama mahasiswa yang ingin dicari: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
        sc.close();
    }
}
