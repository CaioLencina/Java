package br.edu.qi.projanadador;

public class Nadador {
    private String nome;
    private byte idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }


    public String classificarNadador() {
        if (this.idade > 8 && this.idade < 10) {
            return "Infantil";
        } else if (this.idade >= 11 && this.idade <= 17) {
            return "Juvenil";
        } else if (this.idade >= 18 && this.idade <= 49) {
            return "Adulto";
        } else if (this.idade >= 50 && this.idade <= 60) {
            return "Terceira idade";
        } else {
            return "Não pode ser nadador";
        }
    }

    public String toString() {
        return "\n"
                + "Nome: " + nome + "\n"
                + "Idade: " + idade + "\n"
                + "Situação: " + classificarNadador();
    }

}
