package c_m_sports.src.pessoas;

public class Cliente extends Pessoa {

    private String cpf;
    private String email;
    private String esporteFavorito;

    public Cliente(String nome, int idade, String cpf, String email, String esporteFavorito) {
        super(nome, idade);
        this.cpf = cpf;
        this.email = email;
        this.esporteFavorito = esporteFavorito;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEsporteFavorito() {
        return esporteFavorito;
    }

    public void setEsporteFavorito(String esporteFavorito) {
        this.esporteFavorito = esporteFavorito;
    }

    @Override
    public void exibir() {
        System.out.println("=== Cliente ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Esporte favorito: " + esporteFavorito);
    }
}
