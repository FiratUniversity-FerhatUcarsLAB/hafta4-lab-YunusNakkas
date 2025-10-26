package odeva;

import java.util.Scanner;

public class odevhafta4 {

	public static void main(String[] args) {
		// Önce Scannerı tanıtmamız lazım
		Scanner scanner= new Scanner(System.in);
		System.out.println("Lütfnen adınızı giriniz");
		String ad_soyad=scanner.nextLine();
		System.out.println("Lütfen aylık brüt maaşınızı TL cinsinden giriniz");
		double maas=scanner.nextDouble();
		System.out.println("LÜtfen haftalık çalışma saatinizi giriniz");
		int saat=scanner.nextInt();
		System.out.println("Lütfen mesai saatinizi giriniz");
		int mesaı=scanner.nextInt();
		final double SGK_ORANI = 0.14;
		final double GELIR_VERGISI_ORANI = 0.15;
		final double DAMGA_VERGISI_ORANI = 0.00759;
		// Toplam mesai ucretini hesaplamak için
		double mesaı_ucretı=(maas/160)*mesaı*1.5;
		// bundada toplam geliri hesaplamak için
		double toplam_gelır=mesaı_ucretı+ maas;
		// SGK vergisini hesaplamak için 
		double SGK=toplam_gelır*0.14;
		// burdada gelır vergisini hesaplamak için
		double gelır_vergısı=toplam_gelır*0.15;
		//burdada damga vergisini hesaplamak için
		double damga_vergısı=toplam_gelır*0.0079;
		// en sondada önceki vergileri hesaplayıp toplam kesintiyi bulmak için
		double toplam_kesıntı=SGK + gelır_vergısı+ damga_vergısı;
		// burda ise net maasımızı öğrenmek için 
		double net_maas=toplam_gelır-toplam_kesıntı;
		
		System.out.println("====================================");
		System.out.println("			MAAS BORDROSU");
		System.out.println("====================================");
		System.out.println("Çalışan: "+ad_soyad);
		System.out.println("");
		System.out.println("GELIRLER:");
		System.out.println(" Brut Maas: "+maas);
		System.out.println(" Mesai Ücreti(10 SAAT): "+ mesaı_ucretı);
		System.out.println("====================================");
		System.out.println(" TOPLAM GELIR: "+toplam_gelır);
		System.out.println("");
		System.out.println("KESINTILER:");
		System.out.println(" SGK Kesintisi (14.0%)"+ SGK);
		System.out.println(" Gelir Vergisi (15.0%)"+gelır_vergısı);
		System.out.println(" Damga Vergisi (0.8%)"+damga_vergısı);
		System.out.println("-------------------------------------");
		System.out.println(" TOPLAM KESINTI"+ toplam_kesıntı);
		System.out.println("NET MAAS: "+net_maas);
		// Scanneri açtığımız gibi kapatalım
		scanner.close();

	}

}
