package test4;

public class Hotel {
    private String ad;
    private String seher;
    private String olke;
    private int otaqsayi;
    private int ulduz;

    public Hotel(String ad, String seher, String olke, int otaqsayi, int ulduz) {
        this.ad = ad;
        this.seher = seher;
        this.olke = olke;
        this.otaqsayi = otaqsayi;
        this.ulduz = ulduz;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSeher() {
        return seher;
    }

    public void setSeher(String seher) {
        this.seher = seher;
    }

    public String getOlke() {
        return olke;
    }

    public void setOlke(String olke) {
        this.olke = olke;
    }

    public int getOtaqsayi() {
        return otaqsayi;
    }

    public void setOtaqsayi(int otaqsayi) {
        this.otaqsayi = otaqsayi;
    }

    public int getUlduz() {
        return ulduz;
    }

    public void setUlduz(int ulduz) {
        this.ulduz = ulduz;
    }

    public Hotel() {
    }

    @Override
    public String toString() {
        return "test4.Hotel{" +
                "ad='" + ad + '\'' +
                ", seher='" + seher + '\'' +
                ", olke='" + olke + '\'' +
                ", otaqsayi=" + otaqsayi +
                ", ulduz=" + ulduz +
                '}';
    }
}
