public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno("Pedro", 1, 15, 10, 5);
        Aluno obj2 = new Aluno("Ana", 2, 19, 5, 6);

        System.out.println(obj1.dadosAlunos());
        System.out.println(obj2.dadosAlunos());
        obj1.passou();
        obj2.passou();
    }
}