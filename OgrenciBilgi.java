/*
 * Ad Soyad: [Yunus Emre Nakkaş]
 * Ogrenci No: [250542021]
 * Tarih: [26/10/2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
		System.out.println("Lutfnen adinizi giriniz");
		String ad=scanner.nextLine();
		System.out.println("Lütfen soyadınızı giriniz");
		String soyad=scanner.nextLine();
		System.out.println("Lütfen öğrenci numaranızı giriniz");
		String numara=scanner.nextLine();
		System.out.println("Lütfen yaşınızı giriniz");
		int yas=scanner.nextInt();
		System.out.println("Lütfen GPA - Not Ortalama'nızı giriniz ");
		double ortalama=scanner.nextDouble();
		
		System.out.println("======= OGRENCI BILGI SISTEMI =======");
		System.out.println("	    Öğrencin adı	 :"+ ad);
		System.out.println("	    Öğrencini soyadı :"+ soyad);
		System.out.println("		Öğrencini numarası:"+ numara);
		System.out.println("		Öğrencini yaşı   :"+yas);
		System.out.printf("		Öğrencini GPA - Not Ortalaması:  %.2f ",ortalama);
		System.out.println("======= OGRENCI BILGI SISTEMI =======");

        scanner.close();
        
    }
}
