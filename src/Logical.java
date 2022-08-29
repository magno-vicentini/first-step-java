public class Logical {
  public static void main(String[] args) throws Exception {
    int temperature = 22;
    boolean isWarm = temperature > 20 ;
    boolean isPleasant = temperature > 10 && temperature < 20;
    boolean isCold = temperature < 10;
    System.out.println(isWarm);
    System.out.println(isPleasant);
    System.out.println(isCold);
  }
}
