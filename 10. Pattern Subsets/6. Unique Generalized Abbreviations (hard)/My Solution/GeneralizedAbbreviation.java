import java.util.*;

class Abreviated_Word {
  StringBuilder str;
  int start;
  int wordCount;

  public Abreviated_Word (StringBuilder str, int start, int wordCount) {
    this.str = str;
    this.start = start;
    this.wordCount = wordCount;
  }
}

class GeneralizedAbbreviation {

  public static List<String> generateGeneralizedAbbreviation(String word) {
    List<String> result = new ArrayList<String>();
    // TODO: Write your code here

    int len = word.length();
    Queue<Abreviated_Word> queue = new LinkedList<>();
    queue.add(new Abreviated_Word(new StringBuilder(), 0, 0));

    while (!queue.isEmpty()) {
      Abreviated_Word aWord = queue.poll();

      if (aWord.start == len) {

        if (aWord.wordCount != 0) {
          aWord.str.append(aWord.wordCount);
        }

        result.add(aWord.str.toString());

      } else {
        queue.add(new Abreviated_Word(new StringBuilder(aWord.str), aWord.start+1, aWord.wordCount+1));

        if (aWord.wordCount != 0) {
          aWord.str.append(aWord.wordCount);
        }

        queue.add(new Abreviated_Word(new StringBuilder(aWord.str).append(word.charAt(aWord.start)), aWord.start + 1, 0));

      }

    }

    return result;



  }

  public static void main(String[] args) {
    List<String> result = GeneralizedAbbreviation.generateGeneralizedAbbreviation("BAT");
    System.out.println("Generalized abbreviation are: " + result);

    result = GeneralizedAbbreviation.generateGeneralizedAbbreviation("code");
    System.out.println("Generalized abbreviation are: " + result);
  }
}
