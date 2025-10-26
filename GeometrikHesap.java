/*
* Ad Soyad: [Yunus Emre Nakkaş]
* Ogrenci No: [250542021]
* Tarih: [26/10/2025]
* Aciklama: [Geometrikhesap]
*Bu programda bir dairenin alanını,çevresini,hacmini,yüzey alanını hesaplayan bir program yazılmış durumdadır
*/


Scanner scanner= new Scanner(System.in);
		System.out.println("Lütfen yarıçapı giriniz");
		double yarıcap=scanner.nextDouble();
		final  double pi = 3.14159;
        double alan=pi*yarıcap*yarıcap;
        double cevre=2*pi*yarıcap;
        double hacim=4.0/3.0*pi*yarıcap*yarıcap*yarıcap;
        double yuzey_alanı=4*pi*yarıcap*yarıcap;
        
		
		System.out.println("--------Sonuçlar--------");
		System.out.printf(" Diarenin Alanı: %.2f \n",alan );
		System.out.printf(" Diarenin Çevresi: %.2f \n",cevre );
		System.out.printf("Diarenin Çapı: %.2f \n",yarıcap );
		System.out.printf("Diarenin Hacmi : %.2f \n",hacim );
		System.out.printf("Diarenin Yüzey Alanı: %.2f ",yuzey_alanı );
		
		
		
		
        scanner.close();
