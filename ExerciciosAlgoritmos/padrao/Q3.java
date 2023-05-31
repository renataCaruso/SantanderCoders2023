package padrao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
        List<Aluno> listaAlunos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Adicionar os alunos à lista
        listaAlunos.add(new Aluno("João"));
        listaAlunos.add(new Aluno("Maria"));
        listaAlunos.add(new Aluno("Pedro"));
        listaAlunos.add(new Aluno("Ana"));

        // Atualizar a presença dos alunos com base na entrada do usuário
        for (Aluno aluno : listaAlunos) {
            System.out.print("O aluno " + aluno.getNome() + " está presente? (S/N): ");
            String entrada = scanner.nextLine();
            boolean presenca = entrada.equalsIgnoreCase("S");
            aluno.setPresenca(presenca);
        }

        // Mostrar os nomes e presenças dos alunos ao usuário
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.getNome() + " - Presente: " + aluno.getPresenca());
        }

        scanner.close();
    }
}

class Aluno {
    private String nome;
    private boolean presenca;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean getPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }
}
