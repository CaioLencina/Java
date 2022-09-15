package br.edu.projaalunomeu;

public class Aluno{
    private String nome;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String verificarConceito(){
        if (this.media >= 9 && this.media <=10){
            return "Seu conceito é A!";
        }else if (this.media >=8 && this.media <= 8.9){
            return "Seu conceito é B!";
        }else if (this.media >= 6 && this.media <=7.9){
            return "Seu conceito é C!";
        }else {
            return "Seu conceito é D!";
        }
    }



    public String toString(){
        return "\n"
                +"Nome: "+nome+"\n"
                +"Média: "+media+ "\n"
                + "Situação: "+verificarConceito();
    }
}
