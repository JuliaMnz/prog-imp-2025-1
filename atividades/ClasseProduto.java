import java.util.Scanner;

class Produto {
    public String nome;
    public static double preco;
    String titulo;
    String descricao;
    double precoUnitario;
    int qtdEstoque;
}

public class ClasseProduto {
    public static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    Produto p1 = new Produto(), p2 = new Produto();
    System.out.println("-------DIGITAÇÃO DADOS 1º PRODUTO -------");
    lerProduto(p1);
    System.out.println("-------DIGITAÇÃO DADOS 2º PRODUTO -------");
    lerProduto(p2);

    System.out.println("-------IMPRESSÃO-------");
    imprimirProduto(p1);
    imprimirProduto(p2);
  }
  
  public static void lerProduto(Produto p) {
    System.out.print("Digite o título do produto: ");
    p.titulo = input.nextLine();
    System.out.print("Digite a descrição do produto: ");
    p.descricao = input.nextLine();
    System.out.print("Digite o preço unitário: ");
    p.precoUnitario = input.nextDouble();
    System.out.print("Digite a quantidade no estoque: ");
    p.qtdEstoque = input.nextInt();
    input.nextLine();
  }

  public static void imprimirProduto(Produto p) {
    System.out.printf("Título: %s\nDescrição: %s\nPreço Unitário: R$ %.2f\nQuantidade em estoque: %d\n\n",
    p.titulo, p.descricao, p.precoUnitario, p.qtdEstoque);
  }
}
