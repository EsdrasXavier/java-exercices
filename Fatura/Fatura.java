public class Fatura {

  public static void showProduct(int cod, String description, int qtd, float price) {
    String msg = "Código: " + cod + "\n";
    msg += "Quantidade: " + qtd + "\n";
    msg += "Preço unitário: R$ " + price + "\n";
    msg += "Total: R$ " + (price * qtd);
    System.out.println(msg);
  }

  public static void main(String[] args) {
    int cod = Integer.valueOf(args[0]);
    String description = String.valueOf(args[1]);
    int qtd = Integer.valueOf(args[2]);
    float price = Float.valueOf(args[3]);

    showProduct(cod, description, qtd, price);
  }
}