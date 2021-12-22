import java.util.*;

class GenerateParentheses {

  public static List<String> generateValidParentheses(int num) {
    List<String> result = new ArrayList<String>();
    // TODO: Write your code here
    return result;
  }

  public static void main(String[] args) {
    List<String> result = GenerateParentheses.generateValidParentheses(2);
    System.out.println("All combinations of balanced parentheses are: " + result);

    result = GenerateParentheses.generateValidParentheses(3);
    System.out.println("All combinations of balanced parentheses are: " + result);
  }
}
