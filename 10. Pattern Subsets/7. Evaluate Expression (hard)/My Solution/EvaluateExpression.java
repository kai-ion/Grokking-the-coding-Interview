import java.util.*;

class EvaluateExpression {
  public static List<Integer> diffWaysToEvaluateExpression(String input) {
    List<Integer> result = new ArrayList<>();
    // TODO: Write your code here

    if (!input.contains("+") && !input.contains("*") && !input.contains("-")) {
      result.add(Integer.parseInt(input));
    }else {
      int len = input.length();

      for (int i = 0; i < len; i++) {

        char ch = input.charAt(i);
        if (!Character.isDigit(ch)) {
          List<Integer> left = diffWaysToEvaluateExpression(input.substring(0, i));
          List<Integer> right = diffWaysToEvaluateExpression(input.substring(i + 1));

          for (int part1 : left) {

            for (int part2 : right) {
              if (ch == '+') {
                result.add(part1 + part2);
              }
              else if (ch == '-') {
                result.add(part1 - part2);
              }
              else if (ch == '*') {
                result.add(part1 * part2);
              }
            }
          }
        }
     

      }

    }


    return result;
  }

  public static void main(String[] args) {
    List<Integer> result = EvaluateExpression.diffWaysToEvaluateExpression("1+2*3");
    System.out.println("Expression evaluations: " + result);

    result = EvaluateExpression.diffWaysToEvaluateExpression("2*3-4-5");
    System.out.println("Expression evaluations: " + result);
  }
}
