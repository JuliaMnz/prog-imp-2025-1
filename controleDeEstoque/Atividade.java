import java.util.Scanner;

public class Atividade {
    public static final int TAM = 100;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Produto[] produtos = new Produto[TAM];
        int qtdProdutos = 0;
        int opcao;

        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar");
            System.out.println("3 - Filtrar por categoria");
            System.out.println("4 - Ordenar por nome");
            System.out.println("5 - Renomear produto");
            System.out.println("6 - Atualizar preço");
            System.out.println("7 - Subtotal por categoria");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            if (opcao == 1) {
                if (qtdProdutos < TAM) {
                    produtos[qtdProdutos] = cadastrarProduto();
                    qtdProdutos++;
                } else {
                    System.out.println("Limite de produtos atingido.");
                }
            } else if (opcao == 2) {
                listar(produtos, qtdProdutos);
            } else if (opcao == 3) {
                filtrarPorCategoria(produtos, qtdProdutos);
            } else if (opcao == 4) {
                ordenarPorNome(produtos, qtdProdutos);
            } else if (opcao == 5) {
                renomearProduto(produtos, qtdProdutos);
            } else if (opcao == 6) {
                atualizarPreco(produtos, qtdProdutos);
            } else if (opcao == 7) {
                subtotalPorCategoria(produtos, qtdProdutos);
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
    }

    public static Produto cadastrarProduto() {
        Produto p = new Produto();

        System.out.print("Nome do produto: ");
        p.nome = input.nextLine();

        System.out.print("Quantidade em estoque: ");
        p.qtdEstoque = input.nextInt();

        System.out.print("Preço unitário: ");
        p.precoUnitario = input.nextDouble();
        input.nextLine(); 

        System.out.print("Categoria: ");
        p.categoria = input.nextLine();

        System.out.print("Quantidade mínima: ");
        p.qtdMinima = input.nextInt();
        input.nextLine(); 

        return p;
    }

    public static void listar(Produto[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " - " + v[i].nome + " - " + v[i].qtdEstoque + " - " + v[i].precoUnitario + " - " + v[i].categoria + " - mín: " + v[i].qtdMinima);
        }
    }

    public static void filtrarPorCategoria(Produto[] v, int n) {
        System.out.print("Digite a categoria: ");
        String cat = input.nextLine();

        for (int i = 0; i < n; i++) {
            if (v[i].categoria.equalsIgnoreCase(cat)) {
                System.out.println(v[i].nome + " - " + v[i].qtdEstoque + " - R$" + v[i].precoUnitario);
            }
        }
    }

    public static void ordenarPorNome(Produto[] v, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (v[i].nome.compareToIgnoreCase(v[j].nome) > 0) {
                    Produto aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        System.out.println("Produtos ordenados por nome.");
    }

    public static void renomearProduto(Produto[] v, int n) {
        listar(v, n);
        System.out.print("Digite o número do produto a renomear: ");
        int i = input.nextInt() - 1;
        input.nextLine();

        if (i >= 0 && i < n) {
            System.out.print("Novo nome: ");
            v[i].nome = input.nextLine();
            System.out.println("Produto renomeado.");
        } else {
            System.out.println("Produto inválido.");
        }
    }

    public static void atualizarPreco(Produto[] v, int n) {
        listar(v, n);
        System.out.print("Digite o número do produto para atualizar o preço: ");
        int i = input.nextInt() - 1;

        if (i >= 0 && i < n) {
            System.out.print("Novo preço: ");
            v[i].precoUnitario = input.nextDouble();
            input.nextLine();
            System.out.println("Preço atualizado.");
        } else {
            System.out.println("Produto inválido.");
        }
    }

    public static void subtotalPorCategoria(Produto[] v, int n) {
        String[] categorias = new String[TAM];
        double[] subtotais = new double[TAM];
        int qtdCategorias = 0;

        for (int i = 0; i < n; i++) {
            int pos = -1;
            for (int j = 0; j < qtdCategorias; j++) {
                if (v[i].categoria.equalsIgnoreCase(categorias[j])) {
                    pos = j;
                    break;
                }
            }

            if (pos == -1) {
                categorias[qtdCategorias] = v[i].categoria;
                subtotais[qtdCategorias] = v[i].qtdEstoque * v[i].precoUnitario;
                qtdCategorias++;
            } else {
                subtotais[pos] += v[i].qtdEstoque * v[i].precoUnitario;
            }
        }

        double totalGeral = 0;
        for (int i = 0; i < qtdCategorias; i++) {
            System.out.println("\n" + categorias[i]);
            for (int j = 0; j < n; j++) {
                if (v[j].categoria.equalsIgnoreCase(categorias[i])) {
                    System.out.println(v[j].nome + " - " + v[j].qtdEstoque + " - " + v[j].precoUnitario);
                }
            }
            System.out.printf("Subtotal: R$ %.2f\n", subtotais[i]);
            totalGeral += subtotais[i];
        }

        System.out.printf("\nTotal geral: R$ %.2f\n", totalGeral);
    }
}
