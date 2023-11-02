package entity;

public class GiamGia {
    private String maGiamGia;
    private double phanTram;

    public GiamGia(String maGiamGia, double phanTram) {
        this.maGiamGia = maGiamGia;
        this.phanTram = phanTram;
    }

    public GiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public GiamGia() {
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public double getPhanTram() {
        return phanTram;
    }

    public void setPhanTram(double phanTram) {
        this.phanTram = phanTram;
    }

}
