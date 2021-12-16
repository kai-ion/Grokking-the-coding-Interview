class CircularArrayLoop {

    public static boolean loopExists(int[] arr) {
      // TODO: Write your code here
        int n = arr.length;
        if (n <= 1 ) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            int fast = i;
            int slow = i;
    
            boolean dir = arr[i] > 0;
            
            do {
                slow = get_next(arr, slow, dir, n);
                fast = get_next(arr, fast, dir, n);
    
                if (fast != -1) {
                    fast = get_next(arr, fast, dir, n);
                }
            } while (fast != slow && fast != -1 && slow != -1);
    
            if (fast != -1 && slow == fast) {
                return true;
            }
        }




      return false;
    }

    public static int get_next (int[] arr, int curr, boolean dir, int n) {

        boolean forward = arr[curr] >= 0;

        if (dir != forward) {
            return -1;
        }

        int nextIndex = (curr + arr[curr]) % n;
        if (nextIndex < 0) {
            nextIndex += n;
        }

        if (nextIndex == curr) {
            return -1;
        }

        return nextIndex;
    }
  
    public static void main(String[] args) {
      System.out.println(CircularArrayLoop.loopExists(new int[] { 1, 2, -1, 2, 2 }));
      System.out.println(CircularArrayLoop.loopExists(new int[] { 2, 2, -1, 2 }));
      System.out.println(CircularArrayLoop.loopExists(new int[] { 2, 1, -1, -2 }));
    }
  }