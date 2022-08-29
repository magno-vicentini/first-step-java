public class SwitchStatement {
  public static void main(String[] args) throws Exception {
    String role = "admin";
      switch (role) {
        case "admin":
          System.out.println("You're a admin");
          break;
        case "moderator":
          System.out.println("You're a moderator");
          break;
        default:
          System.out.println("You're a guest");  
      }
  }
}
