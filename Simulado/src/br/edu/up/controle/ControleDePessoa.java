package br.edu.up.controle;

import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Endereco;

import java.util.ArrayList;
import java.util.List;

public class ControleDePessoa {

    private List<Pessoa> pessoas;

    public PessoaController() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public Pessoa encontrarPessoaPorCodigo(int codigo) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == codigo) {
                return pessoa;
            }
        }
        return null;
    }

    public void adicionarEndereco(int codigo, Endereco endereco) {
        Pessoa pessoa = encontrarPessoaPorCodigo(codigo);
        if (pessoa != null) {
            pessoa.setEndereco(endereco);
        }
    }

}
