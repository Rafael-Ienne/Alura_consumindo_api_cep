package Entities;

public class City {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private int ibge;
    private int gia;
    private int ddd;
    private int siafi;

    public City(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, int ibge, int gia, int ddd, int siafi) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public int getIbge() {
        return ibge;
    }

    public int getGia() {
        return gia;
    }

    public int getDdd() {
        return ddd;
    }

    public int getSiafi() {
        return siafi;
    }
}
