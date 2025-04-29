import java.util.*;

class hello {
  Scanner sc = new Scanner(System.in);
  // outputs Hello while user wants to

  void showHello() {
    String choice; // guard varible
    System.out.println("For hello type h anything else to stop");
    choice = sc.next();// set guard variable

    while ("h".equals(choice)) {
      System.out.println("Hello");
      choice = sc.next();// update guard variable
    }
  }

  public static void main(String[] args) {
    var obj = new hello();
    obj.showHello();
  }
}
