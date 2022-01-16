import java.util.*;

class LetterCaseStringPermutation {

  public static List<String> findLetterCaseStringPermutations(String str) {
    List<String> permutations = new ArrayList<>();
    // TODO: Write your code here
    if (str == null) {
      return permutations;
    }

    int len = str.length();
    permutations.add(str);

    for (int i = 0; i < len; i++) {

      if (Character.isLetter(str.charAt(i))) {
        
        int permLen = permutations.size();

        for (int j = 0; j < permLen; j++) {

          char[] chs = permutations.get(i).toCharArray();

          if (Character.isUpperCase(chs[i])) {
            chs[i] = Character.toLowerCase(chs[i]);
          }
          else if (Character.isLowerCase(chs[i])) {
            chs[i] = Character.toUpperCase(chs[i]);
          }

          permutations.add(String.valueOf(chs));

        }

      }

    }

    return permutations;
  }

  public static void main(String[] args) {
    List<String> result = LetterCaseStringPermutation.findLetterCaseStringPermutations("ad52");
    System.out.println(" String permutations are: " + result);

    result = LetterCaseStringPermutation.findLetterCaseStringPermutations("ab7c");
    System.out.println(" String permutations are: " + result);
  }
}
