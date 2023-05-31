
package tugas9;

public class LinkedList {
        Simpul pertama =null,posisi,pendahulu;
        public void isiData(String nim, String nama, int nilai){
        Simpul ptrBaru = new Simpul(nim,nama,nilai);
        ptrBaru.berikutnya = pertama;
        pertama = ptrBaru;
    }

    public void Tampilkan(){
        System.out.println("Isi Linked List\n");
        Simpul penunjuk = pertama;
        while(penunjuk != null){
        penunjuk.infoData();
        System.out.println(penunjuk.berikutnya);
        penunjuk = penunjuk.berikutnya;
        }
    }

    public boolean findData(String x){
        posisi = pertama;
        pendahulu = null;
        boolean ditemukan = false;
        while(posisi !=null){
        String nama = posisi.nama;
        if(nama.compareTo(x)==0){
        ditemukan = true;
        break;
        }
        pendahulu = posisi;
        posisi = posisi.berikutnya;
        }
    return ditemukan;
    }

    public boolean hapusData(String x){
        pendahulu = null;
        posisi = null;
        boolean ditemukan = findData(x);
        if(!ditemukan){
            System.out.println("Data yang akan dihapus tidak dapat ditemukan");
            return false;
        }
        if(pendahulu==null){
        pertama = pertama.berikutnya;
    }
    else{
        pendahulu.berikutnya = posisi.berikutnya;
    }
    return true;
    }
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.isiData("20220040281", "Siti nurviatika", 100);
        ls.Tampilkan();
    }
}
