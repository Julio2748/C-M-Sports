package c_m_sports.src.cadastro;

import c_m_sports.src.pessoas.Cliente;
import java.util.ArrayList;

public class CadastroCliente {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void incluirCliente(Cliente cliente) {
        if (cliente.getIdade() < 0) {
            System.out.println("Erro: idade não pode ser negativa!");
            return;
        }
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            System.out.println("Erro: nome não pode ser vazio!");
            return;
        }
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void excluirCliente(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                clientes.remove(c);
                System.out.println("Cliente removido com sucesso!");
                return;
            }
        }
        System.out.println("Cliente não encontrado!");
    }

    public void buscarPorNome(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().toLowerCase().contains(nome.toLowerCase())) {
                c.exibir();
            }
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public AnaliseClientes getAnalise() {
        return new AnaliseClientes(clientes);
    }
}