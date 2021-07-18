package sequality;

public class Calculate {
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

  public int sumOfEven(int x, int y) {
    int sum = 0;

    for (int i = x; i <= y; i++) {
      if (i % 2 == 0)
        sum += i;
    }
    return sum;
  }

  public int sumOfOdd(int x, int y) {
    int sum = 0;

    for (int i = x; i <= y; i++) {
      if (i % 2 == 1)
        sum += i;
    }
    return sum;
  }

  public double average(int x, int y) {
    int sum = this.sumXtoY(x, y);
    double ave = (double) sum / (y - x + 1);
    return ave;
  }

  public String getSum(int x, int y) {
    return "Sum of " + x + " and " + y + " is " + sum(x, y) + "." + " Average is " + average(x, y) + ".";
  }

  public String getSumXtoY(int x, int y) {
    return "Sum of " + x + " to " + y + " is " + sumXtoY(x, y) + "." + " Average is " + average(x, y) + ".";
  }

  public String getSumOfOdd(int x, int y) {
    return "Sum of odd of " + x + " to " + y + " is " + sumOfOdd(x, y) + "." + " Sum of even is " + sumOfEven(x, y)
        + ".";
  }

  public String getGreeting() {
    return "Hello World!";
  }
}
