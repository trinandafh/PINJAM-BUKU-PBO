public class Denda {
    private Peminjaman peminjaman;
    private int hariTerlambat;
    private int tarifDenda = 10000;

    public Denda ( Peminjaman peminjaman, int hariTerlambat){
        this.peminjaman = peminjaman;
        this.hariTerlambat = hariTerlambat;
    }

    public Peminjaman getPeminjaman(){
        return peminjaman;
    }

    public int getTagihan(){
        return tarifDenda * hariTerlambat;
    }

    public int gethariTerlambat(){
        return hariTerlambat;
    }




}
