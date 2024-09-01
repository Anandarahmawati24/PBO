public class Main {
    public static void main(String[] args) {
        //Variabel dan Tipe Data
        int x = 5;
        int y = 1;
        float a = 1.f;
        double b = 2.f;

        //Tipe data primitive = bawaan java & diawali dengan huruf kecil
        //cth = int, float, double, boolean, char
        //Tipe data Objek (non-primitive) =  diawali huruf besar
        //cth = String

        String nama = "Ananda Rahmawati";
        // Itu sama dengan
        String nama2 = new String("Ananda Rahmawati");
        //Tipe data Objek tertentu dapat disingkat seolah-olah dia adalah dia adalah tipe data primitive
        //"Syntetic Sugar" = memudahkan progammer untuk menuliskan kode program

        //Tipe memori
        //Stack = menampung sedikit data dan kecil namun cepat (tempat menyimpan variabel primitive)
        //Menyimpan isi data
        //Heap = Berkapasitas besar namun lambat (tempat menyimpan variabel objek)
        //Menyimpan alamat data

        //Function
        //Sesuatu yang mengolah

        // perulangan

        // diganti dengan input dari args
        int[] inputAngka = new int[10];
        for (int i = 1; i < args.length; i++) {
            String input = args[i];
            // konversi dari string menjadi interger
            int inputInt = Integer.parseInt(input);
            inputAngka[i - 1] = inputInt;
        }

        int tambah = Main.tambah(x, y);
        int tambahBanyak = Main.tambahBanyak(1, 2, 3, 4);
        boolean isGanjil = Main.isGanjil(99);
        String namaSaya = args[0];
        int hasilAngkaBanyak = Main.tambahBanyak(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));

        System.out.printf("Tambah : %d\n", tambah);
        System.out.printf("Tambah Multi Angka : %d\n", tambahBanyak);
        System.out.printf("Ganjil? " + isGanjil);
        System.out.println("Nama Pembuat : " + args[0]);
        System.out.println("Hasil angka Banyak : " + hasilAngkaBanyak);
    }

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int tambahBanyak(int... bilangan) {
        int hasil = 0;

        for (int i = 0; i < bilangan.length; i++) {
            hasil += bilangan[i];
        }

        return hasil;
    }

    public static boolean isGanjil(int angka) {
        if (angka % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}