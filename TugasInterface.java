package tugasinterface;

public class TugasInterface implements Arsipku{

    public static void main(String[] args) {
        TugasInterface a = new TugasInterface();
        a.tampilBiodata();
        a.tampilNilai();     
    }

    @Override
    public void tampilBiodata() {
        System.out.println("Namaku : Shofia amanda");
        System.out.println("TTL : Jember,22 april 2002");
        System.out.println("Hobi : Volly dan Touring ");
        
    }

    @Override
    public void tampilNilai() {
        System.out.println("Agama : 87");
        System.out.println("Bahasa Indonesia : 85");
        System.out.println("Matematika : 75");
    }
}
