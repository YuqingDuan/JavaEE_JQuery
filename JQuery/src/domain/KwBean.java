package domain;

public class KwBean {
    private int id;
    private String kw;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKw() {
        return kw;
    }

    public void setKw(String kw) {
        this.kw = kw;
    }

    @Override
    public String toString() {
        return "kwBean [id=" + id + ", kw=" + kw + "]";
    }
}
