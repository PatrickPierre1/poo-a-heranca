package faculdadeheranca;

public class Funcionario {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;


    public void imprimir() {
        System.out.println(this);
    }
}


