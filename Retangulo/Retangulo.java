public class Retangulo {

  public static void checkForError(float side1, float side2) {
    if (side1 <= 0 || side2 <= 0) {
      System.out.println("Um dos lados é igual ou menor que zero!");
      return ;
    }

    float area = side1 * side2;
    float perimeter = side1 + side1 + side2 + side2;

    String msg = "Area: " + area + "\n";
    msg += "Perímetro: " + perimeter;

    System.out.println(msg);
  }


  public static void main(String[] args) {
    float side1 = Float.valueOf(args[0]);
    float side2 = Float.valueOf(args[1]);

    checkForError(side1, side2);
  }
}