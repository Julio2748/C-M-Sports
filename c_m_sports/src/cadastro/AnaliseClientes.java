package c_m_sports.src.cadastro;

import c_m_sports.src.pessoas.Cliente;

import java.util.ArrayList;

public class AnaliseClientes {

    private ArrayList<Cliente> clientes;

    public AnaliseClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente clienteMaisVelho() {
        Cliente maisVelho = clientes.get(0);
        for (Cliente c : clientes) {
            if (c.getIdade() > maisVelho.getIdade()) {
                maisVelho = c;
            }
        }
        return maisVelho;
    }

    public Cliente clienteMaisJovem() {
        Cliente maisJovem = clientes.get(0);
        for (Cliente c : clientes) {
            if (c.getIdade() < maisJovem.getIdade()) {
                maisJovem = c;
            }
        }
        return maisJovem;
    }

    public double idadeMedia() {
        double soma = 0;
        for (Cliente c : clientes) {
            soma += c.getIdade();
        }
        return soma / clientes.size();
    }

    public int qtdMaiores60() {
        int count = 0;
        for (Cliente c : clientes) {
            if (c.getIdade() > 60) {
                count++;
            }
        }
        return count;
    }

    public int qtdMenores18() {
        int count = 0;
        for (Cliente c : clientes) {
            if (c.getIdade() < 18) {
                count++;
            }
        }
        return count;
    }
}