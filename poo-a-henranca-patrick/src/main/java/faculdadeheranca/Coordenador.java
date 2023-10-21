package faculdadeheranca;

import java.util.Scanner;

public class Coordenador extends Funcionario {

    private String curso;

    private String turma;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + getNome() + '\'' +
                ", curso='" + getCurso() + '\'' +
                ", turma='" + getTurma() + '\'' +
                '}';
    }

    public static Coordenador construir() {
        var coordenador = new Coordenador();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        coordenador.setNome(scanner.nextLine());

        System.out.println("Curso: ");
        coordenador.setCurso(scanner.nextLine());

        System.out.println("Turma: ");
        coordenador.setTurma(scanner.nextLine());

        return coordenador;
    }
}
