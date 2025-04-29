package Jobsheet9;

public class StackSurat20 {
    Surat20 stack[];
    int top, size;

    public StackSurat20(int size) {
        this.size = size;
        stack = new Surat20[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat20 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat20 pop() {
        if (!isEmpty()) {
            Surat20 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diverifikasi.");
            return null;
        }
    }

    public Surat20 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                System.out.println("ID Surat     : " + stack[i].idSurat);
                System.out.println("Nama Mahasiswa: " + stack[i].namaMahasiswa);
                System.out.println("Kelas        : " + stack[i].kelas);
                System.out.println("Jenis Izin   : " + stack[i].jenisIzin);
                System.out.println("Durasi       : " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama '" + nama + "' tidak ditemukan di dalam stack.");
        }
    }
}
