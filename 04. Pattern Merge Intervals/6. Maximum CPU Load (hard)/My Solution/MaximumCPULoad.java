import java.util.*;

class Job {
  int start;
  int end;
  int cpuLoad;

  public Job(int start, int end, int cpuLoad) {
    this.start = start;
    this.end = end;
    this.cpuLoad = cpuLoad;
  }
};

class MaximumCPULoad {

  public static int findMaxCPULoad(List<Job> jobs) {
    // TODO: Write your code here
    int len = jobs.size();
    int cpuUse = 0;
    int maxCpu = 0;

    if (jobs == null || len == 0 ) {
      return 0;
    }

    Collections.sort(jobs, (a, b) -> Integer.compare(a.start, b.start));

    PriorityQueue<List<Job>> minHeap = new PriorityQueue<>
        (len, (a, b) -> Integer.compare(a.end, b.end));

    for (Job job : jobs) {
      while (minHeap != null && job.start >= minHeap.peak().end) {
        cpuUse -= minHeap.peak().cpuLoad;
      }

      minHeap.offer(job);
      cpuUse += job.cpuLoad;

      maxCpu = Math.max(cpuUse, maxCpu);
    }
    
    return maxCpu;
  }

  public static void main(String[] args) {
    List<Job> input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 3), new Job(2, 5, 4), new Job(7, 9, 6)));
    System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));

    input = new ArrayList<Job>(Arrays.asList(new Job(6, 7, 10), new Job(2, 4, 11), new Job(8, 12, 15)));
    System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));

    input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 2), new Job(2, 4, 1), new Job(3, 6, 5)));
    System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));
  }
}
