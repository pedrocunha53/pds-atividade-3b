public class App {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa para cada estuantes
        Pessoa pessoa = new Pessoa("Daniel", 25);
        Pessoa pessoa1 = new Pessoa("Pedro Henry", 18);

        // Exibindo as informações dos estudantes
        pessoa.exibirInformacoes();
        pessoa1.exibirInformacoes();
    }
}