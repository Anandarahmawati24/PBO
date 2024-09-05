//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Membaca Input dari Parameter
        double hutang= Double.parseDouble(args[0]);
        float bunga = Float.parseFloat(args[1]);
        int jumlahCicilan = Integer.parseInt(args[2]);

        //Tampilkan data input
        System.out.println("Hutang               : " +hutang);
        System.out.println("Bunga                : " +bunga);
        System.out.println("Jumlah Cicilan       : " +jumlahCicilan);

        //Menghitung total yang harus dibayar
        double TotalBayar = hutang + (hutang * 15/100);

        //Jumlah yang harus dibayarkan tiap cicilan
        double angsuran= TotalBayar / jumlahCicilan;

        //Tampilan data total bayar dan angsuran
        System.out.println("-----------------------------------");
        System.out.println("Total Bayar          : " +TotalBayar);
        System.out.println("Angsuran             : " +angsuran);


        // Baris Pembatas
        System.out.println("+--------------+--------------+--------------+");
        System.out.printf("| %-12s | %-12s | %-12s |\n", "Angsuran Ke-", "Jumlah Bayar", "Sisa Pinjam");

        // Data Tabel
        for (int i=0; i < jumlahCicilan; i++) {
            TotalBayar -= angsuran;
            System.out.println("+--------------+--------------+--------------+");
            System.out.printf("| %12s | %12s | %12s |\n", i+1 , angsuran, TotalBayar );
        }
        // Baris Pembatas
        System.out.println("+--------------+--------------+--------------+");

        // jadikan string untuk menghitung panjang karakter
//        String strAngsuranKe = String.copyValueOf(angsuranKe);
//        String strJumlahBayar = String.copyValueOf(jumlahBayar);
//        String strSisaPinjaman = String.copyValueOf(sisaPinjaman);
//        // jumlah spasi yang dibutuhkan
//        int jmlSpasiAngsuranKe = 14 - strAngsuranKe.length();
//        int jmlJumlahBayar = 14 - strJumlahBayar.length();
//        int jmlSisaPinjaman = 15 - strSisaPinjaman.length();
//        // membuat data menjadi rata kanan
//        for (int i = 0; j <  jmlSpasiAngsuranKe; j++) {
//            strAngsuranKe = (" " + strAngsuranKe);
    }
}