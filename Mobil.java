package praktikumpemlan;
public class Mobil {
    public String noPlat;
    public String warna;
    public String manufaktur;
    public double kecepatan;
    public double waktu;//jam
    public double kecepatandiubah; //menyimpan kecepatan yang telah diubah
    public double waktudiubah; //menyimpan waktu yang telah diubah
    public double jarak; //untuk menyimpan jarak yang ditempuh

    public void setNoPlat(String s){
        noPlat = s;
    }

    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }

    public void setKecepatan(double i){
        kecepatan = rubahKecepatan(i);
    }
    public double rubahKecepatan(double i){// untuk mengubah kecepatan menjadi m/s
        return i * (1000.0 / 3600.0);
    }

    public void setWaktu(double t){
        waktu = rubahSekon(t); 
    }
    public double rubahSekon(double t){// untuk mengubah waktu menjadi sekon
        return t * (3600.0);
    }

    public double hitungJarak(){ //untuk menghitung jarak
        jarak = (kecepatan*waktu)/1000;
        return jarak;
    }
    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.println("menempuh waktu selama "+waktu + "detik");
        System.out.println("menempuh jarak sejauh " + hitungJarak() + "km");
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + "m/s");
    }
}