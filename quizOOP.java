class Karyawan{
    private int id;
    private String nama;
    private int gaji;
    private String jabatan;
    public Karyawan(int idKaryawan, String namaKaryawan, int gajiKaryawan, String jabatanNya){
        id = idKaryawan;
        nama = namaKaryawan;
        gaji = gajiKaryawan;
        jabatan = jabatanNya;
    }
    public int getId(){
        return(id);
    }

    public String getNama() {
        return (nama);
    }

    public int getGaji() {
        return (gaji);
    }

    public String getJabatan(){
        return (jabatan);
    }
}

public class quizOOP {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan(198, "Upin", 15_000_000, "CEO");
        System.out.println("\n=====Karyawan Pertama=====");
        System.out.println("Nama: " + karyawan1.getNama());
        System.out.println("ID: " + karyawan1.getId());
        System.out.println("Gaji: " + karyawan1.getGaji());
        System.out.println("Jabatan: " + karyawan1.getJabatan());

        Karyawan karyawan2 = new Karyawan(199, "Ipin", 10_500_000, "CTO");
        System.out.println("\n=====Karyawan Kedua=====");
        System.out.println("Nama: " + karyawan2.getNama());
        System.out.println("ID: " + karyawan2.getId());
        System.out.println("Gaji: " + karyawan2.getGaji());
        System.out.println("Jabatan: " + karyawan2.getJabatan());

        Karyawan karyawan3 = new Karyawan(200, "Mail", 12_000_000, "CMO");
        System.out.println("\n=====Karyawan Ketiga=====");
        System.out.println("Nama: " + karyawan3.getNama());
        System.out.println("ID: " + karyawan3.getId());
        System.out.println("Gaji: " + karyawan3.getGaji());
        System.out.println("Jabatan: " + karyawan3.getJabatan());

        Karyawan karyawan4 = new Karyawan(201, "Jarjit", 11_000_000, "COO");
        System.out.println("\n=====Karyawan Keempat=====");
        System.out.println("Nama: " + karyawan4.getNama());
        System.out.println("ID: " + karyawan4.getId());
        System.out.println("Gaji: " + karyawan4.getGaji());
        System.out.println("Jabatan: " + karyawan4.getJabatan());
    }
}
