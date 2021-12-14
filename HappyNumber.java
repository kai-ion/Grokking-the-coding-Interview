class HappyNumber {

    public static boolean find(int num) {
      // // TODO: Write your code here

        int p1 = num, p2 = num;

        do  {

            p1 = HappyNumber.find_Square_Sum(p1);
            p2 = HappyNumber.find_Square_Sum(HappyNumber.find_Square_Sum(p2));
        }
        while (p1 != p2);

        if (p1 == 1) {
            return true;
        }

      return false;
    }

    public static int find_Square_Sum (int num) {
        int digit;
        int sum = 0;

        while (num > 0) {
            digit = num % 10;
            sum += Math.pow(digit, 2);
            num /= 10;
        }

        return sum;
    }
  
    public static void main(String[] args) {
      System.out.println(HappyNumber.find(23));
      System.out.println(HappyNumber.find(12));
    }
  }