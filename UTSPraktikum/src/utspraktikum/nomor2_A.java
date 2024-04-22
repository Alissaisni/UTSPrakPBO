package utspraktikum;

public class nomor2_A {
    public static void main(String[] args) {
        int row_baris = 6; 
        
        System.out.println("PATTERN A");
        
        for (int i = 1; i <= row_baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
}
