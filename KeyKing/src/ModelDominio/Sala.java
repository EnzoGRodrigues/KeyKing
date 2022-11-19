package ModelDominio;

import java.util.ArrayList;

public class Sala {
    private Coordenador coordenador; //relacionamento - obrigatório ter um coordenador da sala
    private String nome;
    private String predio;
    private String andar;
    private String localizacao;
    public Sala(String nome, String predio, String andar, String localizacao, Coordenador coordenador ){
        this.setNome(nome);
        this.setPredio(predio);
        this.setAndar(andar);
        this.setLocalizacao(localizacao);
        this.setCoordenador(coordenador);
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
    public Coordenador getCoordenador() {
        return coordenador;
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

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }
}
