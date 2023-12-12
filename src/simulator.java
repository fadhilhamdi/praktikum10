public class simulator {
    public static void main(String[] args) {
      
        asdos asdos = new asdos
        ("Fairuzikun", 22, 7);
        System.out.println(asdos.getNama() + " adalah seorang asdos dengan jam sibuk " + asdos.getjamNgasdos() + " jam");

        dosen dosen = new dosen
        ("Raja OP Damanik", 5);
        System.out.println(dosen.getNama()+ " adalah seorang dosen dengan jam sibuk " + dosen.getjamSibuk() + " jam");

        asdos asdos2 = new asdos
        ("Angel-Chan", 20, 4);
        System.out.println(asdos2.getNama() + " adalah seorang asdos dengan jam sibuk " + asdos2.getjamNgasdos() + " jam");

        mahasiswa mahasiswa = new mahasiswa
        ("Firman", 20);
        System.out.println( mahasiswa.getNama() + " adalah seorang mahasiswa dengan jam sibuk " + mahasiswa.getJamSibuk() + " jam");

        mahasiswa mahasiswa2 = new mahasiswa
        ("Nid to pass this sem", 23);
        System.out.println( mahasiswa2.getNama() + " adalah seorang mahasiswa dengan jam sibuk " + mahasiswa2.getJamSibuk() + " jam");

         dosen dosen2 = new dosen
        ("Nivotko", 3);
        System.out.println(dosen2.getNama()+ " adalah seorang dosen dengan jam sibuk " + dosen2.getjamSibuk() + " jam");

        int totalJamSibukFasilkom = 0;

        totalJamSibukFasilkom += mahasiswa.getJamSibuk() + mahasiswa2.getJamSibuk() + dosen.getjamSibuk()
         + dosen2.getjamSibuk() + asdos.getjamNgasdos() + asdos2.getjamNgasdos();
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + totalJamSibukFasilkom);

        }
    }
    

