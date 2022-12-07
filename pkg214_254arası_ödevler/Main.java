/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg214_254arası_ödevler;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /*    //1.SORU
        //1-x^2/2!+x^4/4

        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int sayi = scan.nextInt();
        double fakt = 1;
        double toplam = 0;
        for (int i = 0; i < sayi - 1; i++) {
            for (int j = 1; j <= 2 * i; j++) {
                fakt *= j;
                toplam = toplam + ((-1) ^ i) * (sayi ^ (2 * i)) / fakt;
            }
        }
        System.out.print(toplam);
        

        
        
        
        
        //2.SORU
        //x-x^3/3!+x^5/5!-x^7/7!...
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        System.out.println("x sayısı girin");
        int x = scan.nextInt();
        double fakt = 1;
        double toplam=0;
        for (int i = 1; i < n; i++) {          
            for (int j = 1; j < 2*i-1; j++) {
                fakt=j;
               toplam=toplam+((-1)^(i-1))*(x^(2*i-1))/fakt; 
            }                        
        }
        System.out.println(toplam);
        

        
        
        

        //3.SORU
        //1/2+1/12+1/30+1/56+1/90...
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        double toplam = 0;
        for (int i = 0; i < n - 1; i++) {
            toplam = toplam + 1 / ((2 * i + 1) * (2 * i + 2));
        }
        System.out.println(toplam);
        

        
        
        
        //4.SORU
        //Bilgisayarın ürettiği 1-99 arası bir tam sayının tahmin edilme oyunu
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int rastgele = rd.nextInt(100);
        int sayac = 1;
        System.out.print("lütfen 1-99 arasında bir tahmin girin");
        int tahmin = scan.nextInt();
        while (true) {
            if (tahmin < 1 || tahmin > 99) {
                System.out.println("lütfen belirtilen aralıkta gir");
                tahmin = scan.nextInt();
            } else if (tahmin < rastgele) {
                System.out.println("daha büyük bir değer gir");
                tahmin = scan.nextInt();
                sayac++;
            } else if (tahmin > rastgele) {
                System.out.println("daha küçük bir değer gir");
                tahmin = scan.nextInt();
                sayac++;
            }else if(tahmin==rastgele){
                System.out.println("doğru");
            } 
            System.out.println("Random sayı:"+rastgele);
           System.out.println("deneme sayınız:"+sayac);
           break;
        }
        


        
        //5.SORU
        //bilgisayarın ürettiği rastgele büyük harfin en fazla 10 denemede tahmin edilme oyunu programı
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int rastgele = rd.nextInt(25)+65;

        ???
        
        
        
        
        //6.SORU
        //1+x/1!+x^2/2!+x^3/3! 
        
          Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        System.out.println("x sayısı girin");
        int x = scan.nextInt();
        double toplam=1;
        double fakt=1;
        for (int i = 1; i < n-1; i++) {
         fakt*=i;
         toplam=toplam+(x^i)/fakt;
        }               
       devamını KİTAPTA ŞEMAYA BAK
                


        

        //7.SORU
        //e^=lim(1+x/n)^n limit n den sonsuza kadar           
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        System.out.println("x sayısı girin");
        int x = scan.nextInt();
        int sonuc = (1 + x / n) ^ n;
        System.out.println("sonuç:"+ sonuc);
       
        
       
        
        //8.SORU
        //e=2k+2/(2k+1)!  k=0 dan başlıyor sonsuza kadar gidiyor
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        double t=2;
        for (int i = 1; i < n;) {
            int fakt=(2*i+1);
            t=t+(2*i+2)/fakt;
        }
         System.out.print("sonuç:"+t);
        
        
        
         

        //9.SORU
        //π=12^1/2{1-1/(3*3)+1/(5*3^2)-1/(7*3^3)....}
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int t = 0;
        for (int i = 0; i < n - 1; i++) {
            t = t + (-1) ^ i / ((2 * i + 1) * 3 ^ i);
        }
        System.out.print("sonuç:"+((12) ^ (1 / 2) * t));
        
        
         

        //10.SORU
        //π/2=4/3,16/15,36/35,64/63...
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int c = 1;
        for (int i = 1; i < n; i++) {
            int c1 = 4 * i * i;
            c = c * c1 / (c1 - 1);
        }
        System.out.print("sonuç:" + (2 * c));

        
        
        
        
        
        
        //11.SORU
        //Klavyeden girilen pozitif tamsayıya göre π(pi)sayısını "Monte Carlo yöntemi"yle hesaplayan program
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int m=0;
        for (int i = 1; i < n; i++) {
            int x=2*Rastgele(max)/(max-1);
            int y=2*Rastgele(max)/(max-1);
               if((x^2)+(y^2)<1){
               m=m+1;               
               }
        }
        System.out.print("sonuç:"+4*m/n);
        
        
        
        
        //12.SORU
        //KLAVYEDEN GİRİLEN BÖLÜM sayısına göre 2^1/2 değerini hesaplayan program
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int t=1;
        for (int i = 1; i < n; ) {
            t=2+1/t;
            
        }
        System.out.println("Sonuç:"+(1+1/t));
        
        
        
        
        //13.SORU
        //KLAVYEDEN GİRİLEN BÖLÜM sayısına göre 3^1/2 değerini hesaplayan program
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int t=1;
        for (int i = 1; i < n-1;) {
           t=1+1/2+1/t;
        }
        System.out.print("sonuç:"+(1+1/t));
        
        
       
        
        
        //14.SORU
        //KLAVYEDEN GİRİLEN BÖLÜM sayısına göre 5^1/2 değerini hesaplayan program
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int t=1;
        for (int i = 1; i < n;) {
           t=4+1/t;
        }
        System.out.print("sonuç:"+(2+1/t));
        
        
        
        
        
        //15.SORU
        //AB doğru parçası uzunluğunu altın orana uygun bölerek AC ve CB uzunluklarını yazdıran program 
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int ab = scan.nextInt();
        double cb=2*ab/(1+Math.pow(5, 0.5));
        double ac=ab-cb;
        System.out.print("ac:"+ac +"    "+"cb:"+cb);
        
        
        
         
        
        //16.SORU
        //klavyeden kısa kenarı girilen altın üçgenin tüm kenarlarını yazdıran program
         Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int a = scan.nextInt();
        int b =a*(1+5^(1/2))/2;
        System.out.println("a:"+a + "  " + "b:"+b);






        
        
        //17.SORU
        //klavyeden girilen doğru parçasını gümüş orana uygun bölerek yazdıran program
        Scanner scan = new Scanner(System.in);
        System.out.println("U sayısı girin");
        int u = scan.nextInt();
        int b = u / (2 + 2 ^ 5);
        int a = u - b;
        System.out.println("a:" + a + "  " + "b:" + b);

        
        
        
        //18.SORU
        //klavyeden girilen üst sınıra kadar olan asal sayıları listeleyen program
        int s ;
        Scanner input = new Scanner(System.in);
        System.out.println("Belirtilen aralıktaki Asal Sayılar");
        System.out.print("\nÜst sınır =");
         int N = input.nextInt();
        System.out.println("\n+++ ASAL SAYILAR +++\n");
         for (int i=2; i<=N; i++){
             s =0 ; 
             for(int j=1; j<=i; j++) {
                 if (i%j == 0) 
                     s++;
             }
        if ( s ==2){
            System.out.print(i+ "\t");
         }
         
    }
       
        
                
                
                 
         

        //19.SORU
        //her iki basamağıda asal sayı olan iki basamaklı pozitif tamsayıları listeleyen program
        for (int i = 2; i <= 7; i++) {
            for (int j = 2; j <= 7; j++) {
                if ((i == 2) || (i == 3) || (i == 5) || (i == 7) && (j == 2) || (j == 3) || (j == 5) || (j == 7)) {
                    System.out.println("sonuç:" + 10 * i + j);
                }
            }
        }
        

        
        //20.SORU(6.88)
        //klavyeden girilen 1 den büyük tamsayının asal çarpanlarını bulan program
        
        ????
     
        
        
        
        
        
        //21.SORU
        //klavyeden girilen pozitif tam sayının chen asalı olup olmadığını test eden program
        Scanner scan = new Scanner(System.in);
        int s = 0;
        System.out.println("Bir n sayısı giriniz");
        int n = scan.nextInt();
        int x = n + 2;
        for (int i = 2; i < n; i++) {
            if (x % i == 0) {
                s++;
            }
        }
        if (s == 0) {
            System.out.println("Girdiğiniz sayı Chen asal sayısıdır.");
        } else {
            System.out.println("Girdiğiniz sayÄ± Chen asalı değildir.");
        }
        
        
        
        
        
        //22.SORU
        //iki asal sayı arasındaki fark 2 ise bunlara ikiz asallar denir buna göre klavyden girilen üst sınıra kadar olan ikiz asalların listesini veren program
        ???
      
        
        
        
        //23.SORU
        //klayeden girilen bir tamsayının mükemmel sayı olup olmadığını test eden program
        int s, t = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Tamsayı:");
        s = input.nextInt();
        for (int i = 1; i < s; i++) {
            if (s % 1 == 0) {
                t += i;
            }
            if (s == t) {
                System.out.println("Mükemmel sayı");
            } else {
                System.out.println("Mükemmel sayı değil");
            }
        }
         

        //24.SORU
        //mükemmel sayıların listesini veren program
        Scanner input = new Scanner(System.in);
        int n, s = 0;
        double a = 1;
        double b = 1;
        System.out.println("Üst sınır girin");
        n = input.nextInt();
        System.out.println("Mükemmel Sayılar:");
        for (int i = 1; i <= n; i++) {
            a = Math.pow(2, i);
            b = Math.pow(2, i + 1) - 1;
            for (int j = 2; j < b; j++) {
                if (b % i == 0) {
                    s++;
                }
            }
            if (s == 0) {

            }
            System.out.println(a * b);
        }

         
        
        

        //25.SORU
        //klavyeden girilen terim sayısı kadar cullen sayılarını listeleyen program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz.");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Cullen sayılar " + (i * (2 ^ i) + 1));
        }
         

        
        
        
        
        
        
        //26.SORU
        //klavyeden girilen terim sayısı kadar fermat sayılarını listeleyen program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n = input.nextInt();
        for (int i=0; i<=n-1; i++){
            System.out.println("Fermat sayıları:" +(2^(2^i)+1));
        }

        
        
        
        
        
        //27.SORU
        //klavyeden girilen x ve y değerleri için mümkün olan tüm leyland sayılarını hesaplayıp ekrana yazdıran program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen x ve y tam sayılarını giriniz:");
        int x = input.nextInt();
        int y = input.nextInt();
        while (x>1 && y>1){
            for (int i = 2; i<=x; i++){
                for (int j = 2; j<=y; j++){
                    System.out.println("Leyland sayıları:" +(i^j+j^i));
                }
            }
            System.out.println();
            break;
        }
        
        
       
        
        //27.SORU
        //klavyeden girilen pozitif tam sayının hilbert sayısı olup olmadığını test eden program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir S sayısı giriniz:");
        int S = input.nextInt();
        if ((S-1)%4==0){
            System.out.println("Hilbert sayısıdır:" +S);
        }
        else {
            System.out.println("Hİlbert sayısı değildir" +S);
        }
   
    
       
        
        
        
        //28.SORU
        //klavyeden girilen iki tam sayının dost sayılar olup olmadığını tespit eden program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen a ve b tam sayılarını giriniz:");
        int a = input.nextInt();
        int b = input.nextInt();
        int ta = 0;
        int tb = 0;
        for (int i = 1; i<=a-1; i++){
            if (a%i==0){
                ta=ta+i;
            }
            else {
            }
        }
        for (int i = 1; i<=b-1; i++){
            if (b%i==0){
                tb = tb+i;
            }
            else {
                
            }
        }
        if (ta==b && tb==a){
            System.out.println("Dost sayılar");
        }
        else{
            System.out.println("Dost sayılar değil");
        }
        
      

        
        
        
        
        
        //29.SORU
        //100-999 arasındaki Armstong sayılarını listeleyen program
        double sayi = 0;
        for (int a = 1; a <= 9;) {
            for (int b = 0; b <= 9;) {
                for (int c = 0; c <= 9;) {
                    sayi = (100 * a) + (10 * b) + (c);
                    if (sayi == (a ^ 3) + (b ^ 3) + (c ^ 3)) {
                        System.out.println("Armstrong sayısı:" + sayi);
                    }

                }

            }
        }
        System.out.println(+sayi);
     
        
        
        
        
        
      //30.SORU
      //klavyeden girilen iki doğal sayının bağdaşık olup olmadığını tespit eden program
       Scanner input = new Scanner (System.in);
        int x, y ;
        System.out.println("İlk sayıyı girin");
        x = input.nextInt();
        System.out.println("İkinci sayıyı girin");
        y = input.nextInt();
        int a = x%10 ;  
        int b = y%10 ;  
        int c = x/10 ;  
        int d = y/10 ;  
        if (a+b==10 && c==d) {  
            System.out.println(x+ " ve " +y+ " Bağdaşık sayılardır.");
        }
        else {
            System.out.println(x+ " ve " +y+ "Bağdaşık sayılar değildir.");
        } 
        
        
        
        
       
        
        
        
        //31.SORU
        //Klavyeden girilen bir tamsayının eksik sayı olup olmadığını eksik sayı ile eksiklik miktarını ekrana yazdıran program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir s sayısı giriniz:");
        int s = input.nextInt();
        int t = 0;
        for (int i = 1; i<=s; i++){
        if (s%i==0){
            t = t+1;
        }
    }
        if (t<2*s){
            System.out.println("Eksik sayıdır ve eksiklik miktarı=" + (2*s-t));  
        }
        else {
            System.out.println("Eksik sayı değildir");
        }
    
        

        
        
        
        
        
        //32.SORU
        //klavyeden girilen üst sınıra kadar olan tam sayılarını listeleyen program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir N sayısı giriniz:");
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            int s = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    s = s + 1;
                }

            }
            if (i % s == 0) {
                System.out.println("tau sayısı=" + i);
            }
        }
        
        
        
        
        
        
        
        //33.SORU
        //Klavyeden girilen adet sayısıncz heterometrik sayıları oluşturan ve bunları açık yazarak alt alta listeleyen program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n = input.nextInt();
        for (int a = 1; a<=n; a++){
            System.out.println("Heterometrik sayılar:" +a*(a+1));
        }
         

        
        
        
        
        
        
        
        //34.SORU
        //Klavyeden girilen pozitif tamsayının Ore sayısı olup olmadığını test eden program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n;
        double s = 0, t = 0;
        System.out.println("Bir tam sayı girin");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s++;
                t = t + (double) 1 / i;
            }
        }
        double ho = s / t;
        if (ho - (int) ho == 0) {
            System.out.println(n + " Ore sayısıdır");
        } else {
            System.out.println(n + " Ore sayısı değil");
        }
       

        
        
        
        
        
        
        //35.SORU
        //Markov sayılarını listeleyen program
        for (int x = 1; x <= 50; x++) {
            for (int y = x; y <= 50; y++) {
                for (int z = y; z <= 50; z++) {
                    if ((x * x) + (y * y) + (z * z) == 3 * x * y * z) {
                        System.out.println("x=" + x + "Y=" + y + "Z=" + z);
                    }
                }
            }
        }
         

        
        
        
        
        
        //36.SORU
        //klavyeden girilen pozitif tam sayının aritmetik sayı olup olmadığını test eden program
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Bir tamsayı girin");
        n = input.nextInt();
        double t = 0, s = 0;
        for (double i = 1; i <= n; i++) {
            if (n % i == 0) {
                t = (double) t + i;
                s++;
            }

        }
        if (t / s == (int) t / s) {
            System.out.println("Aritmetik sayı");
        } else {
            System.out.println("Aritmetik sayı değil");
        }
        
        
      
        
        
        //37.SORU
        //100-999 arasındaki palindrom tamsayılarını listeleyen program
        for (int i = 1; i<=9; i++){
            for (int j = 0; j<=9; j++){
                System.out.println(100*i+10*j+i);
            }
        }
        for (int i = 1; i<=9; i++){
            for (int j = 1; j<=9; j++){
                System.out.println(1000*i+100*j+10*j+i);
            }
        }
        
       
        
        
        
        
        //38.SORU(6.107)
        //klavyeden girilen n basamak sayısına göre palindrom tamsayıların toplam sayısını bulup yazdıran program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n değeri giriniz:");
        int n = input.nextInt();
        double islem = 9*10^((n-1)/2);
        System.out.println(islem);
    
    
        
        
        
        
        
        //39.SORU(6.108)
        //Klavyeden girilen m ve n değerleri için E(m,n)Eulerian sayısını hesaplayan program
        Scanner input = new Scanner(System.in);
        System.out.println("m ve n değerlerini giriniz:");
        double m = input.nextDouble();
        double n = input.nextDouble();
        double t = Math.pow((n+1), m);
        for (int i = 1; i<=n; i++){
            int f1=1, f2=1, f3=1;
            for (int k=1; k<=m+1; k++){
                f1*=k;
            }
            for (int k = 1; k<=i; k++){
                f2*=k;
            }
            for (int k = 1; k<=m+1; k++){
                f3*=k;
            }
            int c=f1/(f2*f3);
            t*=Math.pow((-1), i)*c*Math.pow((n+1-i), m);
        }
        System.out.println(t);
    
    

        
        
        
        
        
        
        //40.SORU
        //Klavyeden girilen terim sayısı iç,n üçgensel sayıları veren program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n = input.nextInt();
        for (int i = 1 ; i<=n; i++){
            double u = (i*(i+1))/2;
            System.out.println(u);
        }
    
        
        
        //41.SORU(110)
        //klavyeden girilen terim sayısı için kare üçgensel sayıları veren program
        
        //42.SORU
        //klavyeden girilen terim sayısı (N) için fibonacci serisinin ilk N terimini bulup ekrana yazan program
        int i,N,T1,T2,T3;
        System.out.print("Fibonacci Serisi \n\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Terim sayısı:");
        N = input.nextInt();
        T1 = 1;
        T2 = 1;
        System.out.print("\n"+T1+"\t"+T2+"\t");
        for (i = 1; i<=N-2; i++){
           T3=T1+T2;
            System.out.print(T3+"\t");
            T1=T2;
            T2=T3;
        }
        
        

        
        
        
        
        
        //43.SORU
        //basamakları toplamı fibonacci sayısı olan 0-99 arasındaki tamsayıları listeleyen program
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                double s = i + j;
                if (s == 1 || s == 2 || s == 3 || s == 5 || s == 8 || s == 13) {
                    System.out.println(10 * i + j);
                } else {

                }
            }
        }
       

        
        
        
        
        
        //44.SORU
        //klavyeden girilen terim sayısınca fibonnaci asallarını listeleyen program
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Terim  sayısı girin");
        n = input.nextInt();
        int f1 = 1, f2 = 1, s2 = 0;
        int f3 = f1 + f2;
        f1 = f2;
        f2 = f3;
        int s1 = 0;
        for (int i = 2; i < f3 - 1; i++) {
            if (f3 % i == 0) {
                s1++;
            }
        }
        if (s1 == 0) {
            s2++;
            System.out.println(f3);
        }
        while (s2 < n) {
            return;
        }       
        
        
        
        
        
        
        
        //45.SORU
        //klavyeden girilen terim sayısına göre negaFibonacci serisinin terimlerini yazdıran program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n = input.nextInt();
        int f1 = 1;
        int f2 = -1;
        System.out.println(f1);
        System.out.print(f2);
        for (int i = 1; i <= n - 2; i++) {
            int f3 = f1 - f2;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }   
        
        
       
        
        
        
        
        
        //46.SORU
        //Klavyeden girilen terim sayısınca (N)Tribonacci serisinin elemanlarını ekrana yazdıran program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir N sayısı giriniz");
        int N = input.nextInt();
        int T1 = 1;
        int T2 = 1;
        int T3 = 2;
        System.out.println(T1);
        System.out.println(T2);
        System.out.println(T3);
        for (int i = 1; i <= N; i++) {
            int T4 = T1 + T2 + T3;
            System.out.println(T4);
            T1 = T2;
            T2 = T3;
            T3 = T4;
        }
    }
 

        //47.SORU(116)
        //Klavyeden girilen büyük değerli fibonacci sayısına göre bir önceki ve bir sonraki fibonnaci sayısını bulan program
        Scanner input = new Scanner(System.in);
        System.out.println("Büyük değerli fibonacci sayısını gir");
        double n = input.nextDouble();
        double ao = (1+Math.pow(5,0.5));
        double f1 = n/ao;
        double f3 = n*ao;
        System.out.println(f1+"/"+n+"/"+f3);
        
        
        
        
        
        //48.SORU
        //klavyeden giirlen terim sayısı kadar pell sayılarını ekrana yazdıran program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir N sayısı giriniz:");
        int N = input.nextInt();
        int P1=0; 
        int P2 = 1;
        System.out.println(P1);
        System.out.println(P2);
        for (int k=1; k<=N-2; k++){
            int P3=2*P2+P1;
            System.out.println(P3);
            P1=P2;
            P2=P3;
        }
     
       
        
        
        
        
        
        //49.SORU(118)
        //Klavyeden girilen m ve n tamsayıları için delannoy sayısını hesaplayan program
        
        
        
        
        
        
        //50.SORU
        //Klavyeden girilen sayısı için floyd üçgenini ekrana yazdıran program
         int n,s=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısı:");
        n = input.nextInt();
        System.out.println("FLOYD ÜÇGENİ");
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.printf("%d\t",s);
                s++;
            }
            System.out.println();
        }
        
        
        
        //51.SORU
        //klavyeden girilen pozitif tamsayı değere göre pisagor üçlemesini hesaplayan program
         Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz");
        int n = input.nextInt();
        for (int a = 1; a<=n-1; a++){
            for (int b = a; b<=n-a; b++){
                double c = n-(a+b);
                if (a*a+b*b==c*c){
                    System.out.println("a"+a);
                    System.out.println("b"+b);
                    System.out.println("c"+c);
                    System.out.println(a*b*c);
                }
                }
            }
            
        
        //52.SORU
        //klavyeden girilen terim sayısınca Bell sayılarını 100 iterasyon ile oluşturup yazdıran program
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz");
        int n = input.nextInt();
        for (int i = 1; i<=n; i++){
            int t = 0;
            int f = 1;
            for (int j = 1; j<=100; j++){
                f = f*j;
                t = t+j^(i/f);
            }
            double e =2.71828;
            System.out.println("sonuç:"+(t/e));
        }
        */
        //53.SORU
        //Klavyeden girilen satır sütun değerine göre ilgili Stirling sayısını hesaplayan yinelemeli alt program/fonksiyon
        
        //54.SORU
        //klavyeden girilen n değerine göre n. Bell sayısını hesaplayan program
        
        
    }


     

}
