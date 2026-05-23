package c_m_sports.src.cadastro;

import c_m_sports.src.pessoas.Cliente;
import c_m_sports.src.excecoes.IdadeInvalidaException;
import c_m_sports.src.excecoes.DadosInvalidosException;

import java.util.ArrayList;

public class CadastroCliente {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void incluirCliente(Cliente cliente) throws IdadeInvalidaException, DadosInvalidosException {
        if (cliente.getIdade() < 0) {
            throw new IdadeInvalidaException("Erro: idade não pode ser negativa!");
        }
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new DadosInvalidosException("Erro: nome não pode ser vazio!");
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
}