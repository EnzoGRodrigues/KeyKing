package ModelDominio;

public enum Status {
    APROVADO("Aprovado"), REPROVADO("Reprovado"), AGUARDANDO("Aguardo");

    private String valor;
    Status(String v){
        setValor(v);
    }
    public String getValor(){
        return valor;
    }
    private void setValor(String v) {
    }
}
