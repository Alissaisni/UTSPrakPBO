package utspraktikum;

public class nomor2_D {
    public static void main(String[] args) {
        int row_baris = 6;
        
        System.out.println("PATTERN D");
        
        for (int i = row_baris; i >= 1; i--) {
            for (int j = row_baris - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            } 
            System.out.println();
        }
        System.out.println();
    
    }
}
   
