public class Transaksi {
    public int tarif;
    public int biaya;
    public int diskon;


    public int hitung(int a,int b){
        setTarif(a);
        return a*b;
    }
    public int hitung(int a,int b,int c){
        setTarif(a);
        setDiskon(b);
        return a*b-c;
    }

    public int getTarif() {
        return tarif;
    }

    public int setTarif(int tarif) {
        this.tarif = tarif;
        return tarif;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getDiskon() {
        return diskon;
    }

    public int setDiskon(int diskon) {
        this.diskon = diskon;
        return diskon;
    }
}
