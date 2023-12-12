public class dosen extends elemen {
    private Integer jumlahHariKerja;
   public dosen (String nama, Integer jumlahHariKerja){
    super(nama);
    this.jumlahHariKerja = jumlahHariKerja;
   }
   public Integer getjamSibuk(){
    return jumlahHariKerja * 8;
   }
}
