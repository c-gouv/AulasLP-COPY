public class Usuario {
    private String login;
    private String senha;
    private boolean ativo = true;

    // criar construtor para todos e getter de todos

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
