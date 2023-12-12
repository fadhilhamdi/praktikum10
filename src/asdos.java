public class asdos extends mahasiswa{
    private Integer jamNgasdos;
public asdos (String nama, Integer sks, Integer jamNgasdos){
    super(nama, sks);
    this.jamNgasdos = jamNgasdos;
}
    public Integer getjamNgasdos(){
        return super.getJamSibuk() + jamNgasdos;
    }

}
