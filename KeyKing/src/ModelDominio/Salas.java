package ModelDominio;

public class Salas {
    private String nome;
    private String predio;
    private String andar;
    private String localizacao;

    public Salas(String nome, String predio, String andar, String localizacao){
        this.setNome(nome);
        this.setPredio(predio);
        this.setAndar(andar);
        this.setLocalizacao(localizacao);
    }

    public String getNome(){
        return nome;
    }
    public String getPredio(){
        return predio;
    }
    public String getAndar(){
        return andar;
    }
    public String getLocalizacao(){
        return localizacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
