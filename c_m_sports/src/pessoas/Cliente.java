package c_m_sports.src.pessoas;

public class Cliente extends Pessoa implements IPessoa{

    private String cpf;
    private String email;
    private String status;

    public Cliente(String nome, int idade, String cpf, String email, String status) {
        super(nome, idade);
        this.cpf = cpf;
        this.email = email;
        setStatus(status);
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

    public String getStatus() {
    return status;
    }

   public void setStatus(String status) {
    String s = status.toLowerCase();
        if (s.equals("ativo") || s.equals("inativo") || s.equals("bloqueado")) {
            this.status = status;
        } else {
            System.out.println("Status inválido! Use: Ativo, Inativo ou Bloqueado.");
            this.status = "Ativo";
        }
    }

    @Override
    public void exibir() {
        System.out.println("=== Cliente ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Status: " + status);
    }
}
