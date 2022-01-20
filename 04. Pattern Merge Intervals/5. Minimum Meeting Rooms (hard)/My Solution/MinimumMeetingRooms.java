import java.util.*;

class Meeting {
  int start;
  int end;

  public Meeting(int start, int end) {
    this.start = start;
    this.end = end;
  }
};

class MinimumMeetingRooms {

  public static int findMinimumMeetingRooms(List<Meeting> meetings) {

    int len = meetings.size();
    int minRoom = 0;


    if (leng == 0 || meetings == null) {
      return 0;
    }

    // TODO: Write your code here  
    Collections.sort(meetings, (a,b) -> Integer.compare(a.start, b.start) );
    
    PriorityQueue<List<Meeting>> minHeap = new PriorityQueue<>
        (len, (a,b) -> Integer.compare(a.end, b.end));

    for (meeting meeting : meetings) {
      while(minHeap.size() != 0 && minHeap.peak().end <= meeting.start) {
        minHeap.poll();
      }

      minHeap.offer(meeting);

      minRoom = Math.max(minRoom, minHeap.size());
    }
    
    return minRoom;
  }

  public static void main(String[] args) {
    List<Meeting> input = new ArrayList<Meeting>() {
      {
        add(new Meeting(4, 5));
        add(new Meeting(2, 3));
        add(new Meeting(2, 4));
        add(new Meeting(3, 5));
      }
    };
    int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
    System.out.println("Minimum meeting rooms required: " + result);

    input = new ArrayList<Meeting>() {
      {
        add(new Meeting(1, 4));
        add(new Meeting(2, 5));
        add(new Meeting(7, 9));
      }
    };
    result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
    System.out.println("Minimum meeting rooms required: " + result);

    input = new ArrayList<Meeting>() {
      {
        add(new Meeting(6, 7));
        add(new Meeting(2, 4));
        add(new Meeting(8, 12));
      }
    };
    result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
    System.out.println("Minimum meeting rooms required: " + result);

    input = new ArrayList<Meeting>() {
      {
        add(new Meeting(1, 4));
        add(new Meeting(2, 3));
        add(new Meeting(3, 6));
      }
    };
    result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
    System.out.println("Minimum meeting rooms required: " + result);

    input = new ArrayList<Meeting>() {
      {
        add(new Meeting(4, 5));
        add(new Meeting(2, 3));
        add(new Meeting(2, 4));
        add(new Meeting(3, 5));
      }
    };
    result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
    System.out.println("Minimum meeting rooms required: " + result);
  }
}
