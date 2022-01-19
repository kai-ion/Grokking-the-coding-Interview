import java.util.*;

class MemoizedSolution {
  // memoization map
  HashMap<String, List<Integer>> map = new HashMap<>();

  public List<Integer> diffWaysToEvaluateExpression(String input) {
    List<Integer> result = new ArrayList<>();

    if (map.containsKey(input)) {
      return map.get(input);
    }
    
    if (!input.contains("+") && !input.contains("-") && !input.contains("*")) {
      result.add(Integer.parseInt(input));
    } else {
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

    

    map.put(input, result);

    return result;
  }

  public static void main(String[] args) {
    MemoizedSolution ee = new MemoizedSolution();
    List<Integer> result = ee.diffWaysToEvaluateExpression("1+2*3");
    System.out.println("Expression evaluations: " + result);
    
    ee = new MemoizedSolution();
    result = ee.diffWaysToEvaluateExpression("2*3-4-5");
    System.out.println("Expression evaluations: " + result);  }
}