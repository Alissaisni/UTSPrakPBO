package utspraktikum;

public class nomor2_C {
    public static void main(String[] args) {
        int row_baris = 6;
        
        System.out.println("PATTERN C");
        
        for (int i = 1; i <= row_baris; i++) { // Loop untuk mengatur spasi sebelum angka
            for (int k = 1; k <= row_baris - i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {  // Loop untuk mencetak angka secara terbalik
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
