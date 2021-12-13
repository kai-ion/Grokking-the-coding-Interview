import java.util.*;

class BackspaceCompare {

  public static boolean compare(String str1, String str2) {
    // TODO: Write your code here
    
    //two pointer starting at end of the Strings
    int p1 = str1.length() - 1, p2 = str2.length() - 1;



    //continue until one string has no more characters
    while (p1 >= 0 || p2 >= 0 ) {
      //get the next letter after backspaces
      int letter1 = BackspaceCompare.back_Space_Counts(str1, p1);
      int letter2 = BackspaceCompare.back_Space_Counts(str2, p2);



      //reached end of both strings
      if (letter1 < 0 && letter2 < 0) {
        return true;
      }

      //only one string finished, return false;
      if (letter1 < 0 || letter2 < 0) {
        return false;
      }

            //compare current letters
      if (str1.charAt(letter1) != str2.charAt(letter2) ) {
        return false;
      }

      //pointer set to current letter - 1;
      p1 = letter1 - 1 ;
      p2 = letter2 - 1;

    }

    return true;
  }

  public static int back_Space_Counts (String str, int pointer) {
    int count = 0;  //count backspaces


    while (count >= 0) {
      if (str.charAt(pointer) == '#') {// add backspace
        count++;
      }
      else if (count > 0) { // found a non backspace character
        count--;
      }
      else 
        break;

      pointer--;  //skip character

    }

    return pointer;
  }


  public static void main(String[] args) {
    System.out.println(BackspaceCompare.compare("xy#z", "xzz#"));
    System.out.println(BackspaceCompare.compare("xy#z", "xyz#"));
    System.out.println(BackspaceCompare.compare("xp#", "xyz##"));    
    System.out.println(BackspaceCompare.compare("xywrrmp", "xywrrmu#p"));
  }
  
}
