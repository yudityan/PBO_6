import java.util.ArrayList;
import java.util.Scanner;
public class User {
    protected int id;
    protected int waktu;

    protected void melihat(int waktu){
        System.out.println("id user :"+id);
        System.out.println("lama memesan :"+waktu+" jam");
    }
    protected int id(int j){
        ArrayList ue = new ArrayList();
        int n = 0;
        for(int i=0; i<=10;i++){
            ue.add(n);
            n++;
        }

        return ue.indexOf(j);
    }
    protected int mengisi(int n){
        Scanner in = new Scanner(System.in);
        setId(id(n));
        System.out.print("Masukkan lama memesan : ");
        waktu = in.nextInt();
        return setWaktu(waktu);

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWaktu() {
        return waktu;
    }

    public int setWaktu(int waktu) {
        this.waktu = waktu;
        return waktu;
    }
}

