import java.util.*;

class GeneralizedAbbreviationRecursive {

  public static List<String> generateGeneralizedAbbreviation(String word) {
    List<String> result = new ArrayList<String>();
    generateAbbreviationRecursive(word, new StringBuilder(), 0, 0, result);
    return result;
  }

  private static void generateAbbreviationRecursive(String word, StringBuilder abWord, int start, int count,
      List<String> result) {

    if (start == word.length()) {
      if (count != 0)
        abWord.append(count);
      result.add(abWord.toString());
    } else {
      // continue abbreviating by incrementing the current abbreviation count
      generateAbbreviationRecursive(word, new StringBuilder(abWord), start + 1, count + 1, result);

      // restart abbreviating, append the count and the current character to the string
      if (count != 0)
        abWord.append(count);
      generateAbbreviationRecursive(word, new StringBuilder(abWord).append(word.charAt(start)), start + 1, 0, result);
    }
  }

  public static void main(String[] args) {
    List<String> result = GeneralizedAbbreviationRecursive.generateGeneralizedAbbreviation("BAT");
    System.out.println("Generalized abbreviation are: " + result);

    result = GeneralizedAbbreviationRecursive.generateGeneralizedAbbreviation("code");
    System.out.println("Generalized abbreviation are: " + result);
  }
}
