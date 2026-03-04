import java.util.Scanner;

public class ProjetoBiblioteca {
    public static void main(String[] args) {
        boolean run = true;
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        while(run) {
            System.out.println("\n\n1 - Inserir livro\n2 - Remover livro\n3 - Mostrar numero de livros\n4 - Sair");
            switch (sc.nextInt()) {
                case 1:
                    biblioteca.inserirLivro(bookFactory());
                    break;
                case 2:
                    System.out.println("\n\nDigite o id do livro que deseja remover:");
                    biblioteca.removerLivro(sc.nextInt());
                    break;
                case 3:
                    System.out.println(biblioteca.getTotalLivros());
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("\nINPUT INVALIDO!");
            }
        }
    }

    private static int nBooks = 0;

    private static Livro bookFactory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nDigite o nome do livro:");
        String nome = sc.nextLine();
        System.out.println("\nDigite a categoria do livro:");
        String categoria = sc.nextLine().toUpperCase();
        System.out.println("\nDigite o autor do livro:");
        String autor = sc.nextLine();
        System.out.println("\nDigite a data de publicação:");
        String dPub = sc.nextLine();
        nBooks++;
        return new Livro(nBooks ,nome, categoria, autor, dPub);
    }
}
