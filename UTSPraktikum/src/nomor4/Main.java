package nomor4;

public class Main {
    public static void main(String[] args) {
        Balok balok1 = new Balok(1, 1, 1);
        Balok balok2 = new Balok(30, 40, 50);
        Balok balok3 = new Balok(25, 35, 45);
       

        System.out.println("Balok dengan panjang " + balok1.panjang + ", lebar : " + balok1.lebar + " dan tinggi: " + balok1.tinggi + ". Luasnya: " + balok1.getLuas() + ", sedangkan kelilingnya : " + balok1.getKeliling() + " dan volumenya: " + balok1.getVolume());
        System.out.println("Balok dengan panjang " + balok2.panjang + ", lebar : " + balok2.lebar + " dan tinggi: " + balok2.tinggi + ". Luasnya: " + balok2.getLuas() + ", sedangkan kelilingnya : " + balok2.getKeliling() + " dan volumenya: " + balok2.getVolume());
        System.out.println("Balok dengan panjang " + balok3.panjang + ", lebar : " + balok3.lebar + " dan tinggi: " + balok3.tinggi + ". Luasnya: " + balok3.getLuas() + ", sedangkan kelilingnya : " + balok3.getKeliling() + " dan volumenya: " + balok3.getVolume());

    }
}
    
