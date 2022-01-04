import java.util.*;

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
};

class EmployeeSchedule {
  Interval interval;
  int employeeIndex;
  int intervalIndex;

  public EmployeeSchedule(Interval interval, int employeeIndex, int intervalIndex) {
    this.interval = interval;
    this.employeeIndex = employeeIndex;
    this.intervalIndex = intervalIndex;
  }
}

class EmployeeFreeTime {

  public static List<Interval> findEmployeeFreeTime(List<List<Interval>> schedule) {
    List<Interval> result = new ArrayList<>();
    // TODO: Write your code here

    int len = shedule.size();
    PriorityQueue<EmployeeSchedule> minHeap = new PriorityQueue<>
      (len, (a,b) -> Integer.compare(a.interval.start, b.interval.start));

    if (len == 0 || schedule == null) {
      result.add(new Interval(0, 24));
    }

    for (int i = 0; i < len; i++) {
      minHeap.offer(new EmployeeSchedule(schedule.get(i).get(0), i, 0));
    }

    Interval prevInterval = minHeap.peak().interval;
    while (minHeap != null) {
      EmployeeSchedule topQueue = minHeap.poll();

      if (prevInterval.end < topQueue.interval.start) {
        result.add(new Interval(prevInterval.end, topQueue.interval.start));
        prevInterval = topQueue.interval;
      }

      else if (prevInterval.end < topQueue.interval.end) {

        prevInterval = topQueue.interval.end;
      }


      List<Interval> employeeSchedule = schedule.get(topQueue.employeeIndex);

      if (employeeSchedule.size() > topQueue.employeeIndex + 1) {
        minHeap.offer(new EmployeeSchedule(
            employeeSchedule.get(topQueue.intervalIndex + 1), topQueue.employeeIndex, topQueue.intervalIndex + 1));
      }


    }

    return result;
  }

  public static void main(String[] args) {

    List<List<Interval>> input = new ArrayList<>();
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3), new Interval(5, 6))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(2, 3), new Interval(6, 8))));
    List<Interval> result = EmployeeFreeTime.findEmployeeFreeTime(input);
    System.out.print("Free intervals: ");
    for (Interval interval : result)
      System.out.print("[" + interval.start + ", " + interval.end + "] ");
    System.out.println();

    input = new ArrayList<>();
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3), new Interval(9, 12))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(2, 4))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(6, 8))));
    result = EmployeeFreeTime.findEmployeeFreeTime(input);
    System.out.print("Free intervals: ");
    for (Interval interval : result)
      System.out.print("[" + interval.start + ", " + interval.end + "] ");
    System.out.println();

    input = new ArrayList<>();
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(2, 4))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(3, 5), new Interval(7, 9))));
    result = EmployeeFreeTime.findEmployeeFreeTime(input);
    System.out.print("Free intervals: ");
    for (Interval interval : result)
      System.out.print("[" + interval.start + ", " + interval.end + "] ");
  }
}
