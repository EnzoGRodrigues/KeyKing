package ModelDominio;

public class Aluno extends Agendador{
    public static String Aluno(String nome, String email, String senha){
        return null;
    }

    @Override
    public void logar(String usuario, String senha) {
        super.logar(usuario, senha);
    }

    @Override
    public void editarPerfil(String email, String senha) {
        super.editarPerfil(email, senha);
    }

    @Override
    public void deslogar() {
        super.deslogar();
    }

    @Override
    public void autenticar() {
        super.autenticar();
    }
}
