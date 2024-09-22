import java.util.Scanner;

public class Main {
    private static String nomeUser = "";
    private static String apelidoUser = "";
    private static int idadeUser = 0;
    private static String telefoneUser = "";
    private static String cpfUser = "";
    private static int idUser = 0;
    private static int valorDoacao = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("************* Algoritmo Doação : ************* ");
        int opcaoDoMenu;

        do {
            System.out.println("""
                    ********** Menu ********** 
                    Crie seu usuário!  (DIGITE ---> [1])
                    Exibir as informações do usuário:  (DIGITE ---> [2])
                    Altere suas informações!  (DIGITE ---> [3])
                    Exclua seu usuário:  (DIGITE ---> [4])
                    Doe para nós:  (DIGITE ---> [5])
                    Sair do menu:  (DIGITE ---> [6])
                    """);
            opcaoDoMenu = sc.nextInt();
            sc.nextLine();

            switch (opcaoDoMenu) {
                case 1 -> cadastroUsuario();
                case 2 -> exibirInformacoes();
                case 3 -> alterarInfo();
                case 4 -> excluirUsuario();
                case 5 -> doarValor();
                case 6 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcaoDoMenu != 6);
        sc.close();
    }

    private static void doarValor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor a ser doado: ");
        valorDoacao = sc.nextInt();
        System.out.println("Sua doação foi feita com sucesso");
    }

    private static void excluirUsuario() {
        nomeUser = "";
        apelidoUser = "";
        idadeUser = 0;
        telefoneUser = "";
        cpfUser = "";
        idUser = 0;
        valorDoacao = 0;
        System.out.println("Usuário excluido com sucesso!");

    }

    private static void alterarInfo() {
        System.out.println("Alteração de Informações");
        cadastroUsuario();
    }

    private static void exibirInformacoes() {
        System.out.println("Nome: " + nomeUser);
        System.out.println("Apelido: " + apelidoUser);
        System.out.println("Idade: " + idadeUser);
        System.out.println("Telefone: " + telefoneUser);
        System.out.println("CPF: " + cpfUser);
        System.out.println("Id usuário: " + idUser);
        System.out.println("Valor doado: " + valorDoacao);
    }

    private static void cadastroUsuario() {
        Scanner dados = new Scanner(System.in);
        System.out.println("Insira seu nome completo: ");
        nomeUser = dados.nextLine();
        System.out.println("Escolha um nickname: ");
        apelidoUser = dados.nextLine();
        System.out.println("Qual sua idade: ");
        idadeUser = dados.nextInt();
        dados.nextLine();
        System.out.println("Insira seu telefone: ");
        telefoneUser = dados.nextLine();
        System.out.println("Qual seu CPF: ");
        cpfUser = dados.nextLine();
    }
}
