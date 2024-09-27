` // 12S24031 - Amelia Renata Lumbanbatu
  // 12S24025 - Paula Gevriella Tambunan

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;

        iSBN = input.nextLine();
        String judulBuku, kategori;

        judulBuku = input.nextLine();
        String penulis;

        penulis = input.nextLine();
        int tahunTerbit;

        tahunTerbit = input.nextInt();
        String namaPenerbit;

        namaPenerbit = input.nextLine();
        String formatBuku;

        formatBuku = input.nextLine();
        double hargaPembelian;

        hargaPembelian = input.nextDouble();
        double minimumMargin;

        minimumMargin = input.nextDouble();
        int stok;

        stok = input.nextInt();
        double rating;

        rating = input.nextDouble();
        if (rating >= 4.7 && rating <= 5.0) {
            kategori = "BestPick";
        } else {
            if (rating >= 4.5 && rating <= 4.7) {
                kategori = "MustRead";
            } else {
                if (rating >= 4.0 && rating <= 4.5) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0 && rating <= 4.0) {
                        kategori = "Average";
                    } else {
                        if (rating >= 0 && rating < 3.0) {
                            kategori = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judulBuku + "|" + penulis + "|" + namaPenerbit + "|" + tahunTerbit + "|" + formatBuku + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
