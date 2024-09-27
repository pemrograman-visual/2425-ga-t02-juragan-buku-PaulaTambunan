  // 12S24031 - Amelia Renata Lumbanbatu
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

        tahunTerbit = Integer.parseInt(input.nextLine());
        String namaPenerbit;

        namaPenerbit = input.nextLine();
        String formatBuku;

        formatBuku = input.nextLine();
        double hargaPembelian;

        hargaPembelian = Double.parseDouble(input.nextLine());
        double minimumMargin;

        minimumMargin = Double.parseDouble(input.nextLine());
        int stok;

        stok = Integer.parseInt(input.nextLine());
        Rating = input.nextLine();
        if (Rating >= 4.7 && Rating <= 5.0) {
            kategori = "Best Pick";
        } else {
            if (Rating >= 4.5 && Rating <= 4.7) {
                kategori = "Must Read";
            } else {
                if (Rating >= 4.0 && Rating <= 4.5) {
                    kategori = "Recommended";
                } else {
                    if (Rating >= 3.0 && Rating <= 4.0) {
                        kategori = "Average";
                    } else {
                        if (Rating >= 0 && Rating < 3.0) {
                            kategori = "Low";
                        } else {
                            kategori = "";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judulBuku + "|" + penulis + "|" + namaPenerbit + "|" + tahunTerbit + "|" + formatBuku + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + Rating + "|" + kategori);
    }
}
