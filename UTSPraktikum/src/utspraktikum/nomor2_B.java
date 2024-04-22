package utspraktikum;

public class nomor2_B {
    public static void main(String[] args) {
        int row_baris = 6;
        
        System.out.println("PATTERN B");
    
        for (int i = row_baris; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
