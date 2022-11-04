import java.util.Scanner;
public class Admin {
    private String usernameAdm;
    private String password;
    User u = new User();
    Transaksi t = new Transaksi();
    Member m = new Member();
    Scanner in=new Scanner(System.in);
    protected void melihat(int a, int b){
        System.out.println("Id user : "+a);
        System.out.println("biaya : "+b);
    }
    private String user(){
        String u = "usadmin";
        return u;
    }
    private String pass(){
        String p = "pwadmin";
        return p;
    }
    protected boolean mengisi(){
        boolean a = false;
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan username : ");
        usernameAdm = in.next();
        setUsernameAdm(usernameAdm);

        if(usernameAdm.equals(user())){
            System.out.print("Masukkan Password : ");
            password=in.next();
            setPassword(password);
            if(password.equals(pass())){
                a = true;
            }
            else{
                System.out.println("Password Salah");
            }
        }
        else {
            System.out.println("Bukan Admin");
        }
        return a;
    }
    protected int mengatur(){
        int harga;
        int diskon;
        System.out.println("Masukkan Tarif harga perjam :");
        harga = in.nextInt();
        t.setTarif(harga);
        return t.setTarif(harga);
    }
    protected int mengatur(int a){
        int diskon;
        System.out.println("Masukkan Diskon untuk member(%) : ");
        diskon = in.nextInt();
        t.setDiskon(a*diskon/100);
        return t.setDiskon(a*diskon/100);
    }


    public String getUsernameAdm() {
        return usernameAdm;
    }
    public void setUsernameAdm(String uesrname) {
        this.usernameAdm = uesrname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
