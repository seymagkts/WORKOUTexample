import java.sql.SQLOutput;
import java.util.Scanner;

public class b {
        public static void main (String[]args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Olusturulabilecek programlar...");
            String hareket= "Burpee\n"+
                            "Pushup(Şınav)\n"+
                            "Situp(Mekik)\n"+
                            "Squat\n";
            System.out.println(hareket);
            System.out.println("İdman olusturun...");
            System.out.println("Burpee Sayisi: ");
            int burpee=scanner.nextInt();
            System.out.println("Pushup Sayisi: ");
            int pushup=scanner.nextInt();
            System.out.println("Situp Sayisi: ");
            int situp= scanner.nextInt();
            System.out.println("Squat Sayisi: ");
            int squat=scanner.nextInt();

            scanner.nextLine();

            idman idman=new idman(burpee,pushup,situp,squat);
            while(idman.bitis()==false) {
                System.out.println("Hareket türü(Burpee,Pushup,Situp,Squat)");
                String tur = scanner.nextLine();
                System.out.println("Kac kere yapılacak? ");
                int tekrar = scanner.nextInt();

                scanner.nextLine();
                idman.hareketSec(tur,tekrar);

            }
        }
   }
