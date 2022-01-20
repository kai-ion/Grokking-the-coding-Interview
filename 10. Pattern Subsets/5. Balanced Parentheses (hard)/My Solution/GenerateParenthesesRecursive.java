import java.util.*;



class GenerateParenthesesRecursive {



  public static List<String> generateValidParentheses(int num) {
    List<String> result = new ArrayList<String>();
    // TODO: Write your code here
    
    char[] paranthesisString = new char[2 * num];
    generateValidParenthesesRecursive(num, paranthesisString, 0, 0, 0, result);

    return result;
  }

  private static void generateValidParenthesesRecursive(int num, char[] ps, int open, 
      int close, int index, List<String> result) {

        if (open == num && close == num) {
          result.add(new String(ps));
        } else {

          if (open < num) {
            ps[index] = '(';

            generateValidParenthesesRecursive(num, ps, open + 1, close, index + 1, result);
          }

          if (open > close) {
            ps[index] = ')';

            generateValidParenthesesRecursive(num, ps, open, close + 1, index + 1, result);
          }

        }

  }

  public static void main(String[] args) {
    List<String> result = GenerateParenthesesRecursive.generateValidParentheses(2);
    System.out.println("All combinations of balanced parentheses are: " + result);

    result = GenerateParenthesesRecursive.generateValidParentheses(3);
    System.out.println("All combinations of balanced parentheses are: " + result);
  }
}
