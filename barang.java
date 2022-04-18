public class barang {
    public String nama_barang;
    public String deskripsi_barang;
    public String asal_barang;
    public String status_barang;
    private int harga_barang;

    public barang(String nama, String deskripsi, String asal, String status) {
        this.nama_barang = nama;
        this.deskripsi_barang = deskripsi;
        this.asal_barang = asal;
        this.status_barang = status;
        this.harga_barang = harga_barang;
    }

    public void printbarang() {
        System.out.println(
                "Nama Barang              : " + this.nama_barang + "\n" +
                "Deskripsi Barang         : " + this.deskripsi_barang + "\n" +
                "Asal Barang              : " + this.asal_barang + "\n" +
                "Status Barang            : " + this.status_barang + "\n" +
                "Harga Barang             : " + this.harga_barang + "\n");
    }

}
