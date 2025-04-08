public class Aritmatika {
    public void hitungPenjumlahan(int a, int b) {
        hitungPerkalian(a, b);
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah: " + nilai);
    }
    public static void hitungPerkalian(int a, int b){
        //hitungPenjumlahan(a, b);
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }
    public static void hitungPengurangan(int a, int b){
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah :" + nilai);
    }
    public double hitungPembagian(String nil1, String nil2) {
        double nilai = 0;
        double a = Integer.parseInt(nil1);
        double b = Integer.parseInt(nil2);
        nilai = a / b;
        if (b != 0) {
            nilai = a / b;
        } else {
            System.out.println("Error untuk pembagian nol!");
        }
        return nilai;
    }
}
