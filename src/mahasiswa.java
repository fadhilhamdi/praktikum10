public class mahasiswa extends elemen {
    private Integer sks;
    
    public mahasiswa(String nama, Integer sks){
        super (nama);
        this.sks = sks; 
    }
    public Integer getJamSibuk (){
        return sks * 3;
    }
}
