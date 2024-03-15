public class Aluno {
    public String nome;
    public int numeroAluno, idade;
    public float p1, p2;

    public Aluno(String nome, int numeroAluno, int idade, float p1, float p2){
        this.nome = nome;
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void mostra(){
        System.out.println("\n número do aluno: " + this.numeroAluno + ", nome: " + this.nome + ", idade: " + this.idade +
                ", nota 1: " + this.p1 + ", nota 2: " + this.p2);
    }

    public float notaFinal(){
        return (this.p1 + this.p2)/2;
    }

    public String dadosAlunos(){
        return "\n Número do aluno: "+this.numeroAluno+", Nome do aluno:"+this.nome+", Idade do aluno: "+this.idade+", Média: "+this.notaFinal();
    }

    public void passou(){
        if(this.notaFinal() >= 6){
            System.out.println("\n o Aluno "+this.nome+" passou com nota "+this.notaFinal()+"!");
        }else {
            System.out.println("\n o Aluno "+this.nome+" não passou com nota "+this.notaFinal()+"!");
        }
    }
}
