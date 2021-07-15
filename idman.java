public class idman {
       private int burpeeSayi;
       private int pushupSayi;
       private int situpSayi;
       private int squatSayi;

       public idman(int burpeeSayi,int pushupSayi,int situpSayi, int squatSayi){
           this.setBurpeeSayi(burpeeSayi);
           this.setPushupSayi(pushupSayi);
           this.setSitupSayi(situpSayi);
           this.setSquatSayi(squatSayi);
       }

public void hareketSec(String hareketTuru, int sayi){
           if(hareketTuru.equals("Burpee")){
               burpeeYap(sayi);
           }else if(hareketTuru.equals("Pushup")){
               pushupYap(sayi);
           }else if(hareketTuru.equals("Situp")){
               situpYap(sayi);
           }else if(hareketTuru.equals("Squat")){
               squatYap(sayi);
           }else{
               System.out.println("Gecersiz hareket...");
           }
}
        public void burpeeYap(int sayi){
                if(burpeeSayi==0){
                    System.out.println("Yapacak burpee kalmadı...");
                }else if(burpeeSayi-sayi<0){
                    System.out.println("Hedef tamamlandı...");
                    burpeeSayi=0;
                    System.out.println("Kalan burpee "+ burpeeSayi);
                }else{
                    burpeeSayi-=sayi;
                    System.out.println("Kalan burpee "+burpeeSayi);
                }
        }
        public void pushupYap(int sayi){
            if(pushupSayi==0){
                System.out.println("Yapacak burpee kalmadı...");
            }else if(pushupSayi-sayi<0){
                System.out.println("Hedef tamamlandı...");
                pushupSayi=0;
                System.out.println("Kalan burpee "+ pushupSayi);
            }else{
                pushupSayi-=sayi;
                System.out.println("Kalan burpee "+pushupSayi);
            }
        }
        public void situpYap(int sayi){
            if(situpSayi==0){
                System.out.println("Yapacak burpee kalmadı...");
            }else if(situpSayi-sayi<0){
                System.out.println("Hedef tamamlandı...");
                situpSayi=0;
                System.out.println("Kalan burpee "+ situpSayi);
            }else{
                situpSayi-=sayi;
                System.out.println("Kalan burpee "+situpSayi);
            }
        }
        public void squatYap(int sayi){
            if(squatSayi==0){
                System.out.println("Yapacak burpee kalmadı...");
            }else if(squatSayi-sayi<0){
                System.out.println("Hedef tamamlandı...");
                squatSayi=0;
                System.out.println("Kalan burpee "+ squatSayi);
            }else{
                squatSayi-=sayi;
                System.out.println("Kalan burpee "+squatSayi);
            }
       }
       public boolean bitis(){
           return(burpeeSayi==0 && situpSayi==0 && pushupSayi==0 && squatSayi==0);
       }

    public int getBurpeeSayi() {
        return burpeeSayi;
    }

    public void setBurpeeSayi(int burpeeSayi) {
        this.burpeeSayi = burpeeSayi;
    }

    public int getPushupSayi() {
        return pushupSayi;
    }

    public void setPushupSayi(int pushupSayi) {
        this.pushupSayi = pushupSayi;
    }

    public int getSitupSayi() {
        return situpSayi;
    }

    public void setSitupSayi(int situpSayi) {
        this.situpSayi = situpSayi;
    }

    public int getSquatSayi() {
        return squatSayi;
    }

    public void setSquatSayi(int squatSayi) {
        this.squatSayi = squatSayi;
    }
}
