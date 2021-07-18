package sequality;

import java.util.Arrays;

public class task02 {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumXtoY(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public double average(int x, int y) {
    int sum = this.sumXtoY(x, y);
    double ave = (double) sum / (y - x + 1);
    return ave;
  }

  public double distributed(int x, int y) {
    double ave = average(x, y);
    double dis = 0;
    for (int i = x; i <= y; i++) {
      dis += (i - ave) * (i - ave);
    }
    dis = dis / (y - x + 1);
    return dis;
  }

  public String getDistributed(int x, int y) {
    return "Average of " + x + " to " + y + " is " + average(x, y) + "." + " Distributed is " + distributed(x, y) + ".";
  }

}
