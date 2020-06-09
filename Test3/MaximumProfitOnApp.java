import java.util.Arrays;

public class solution {

  public static int maximumProfit(int budget[]) {

    Arrays.sort(budget);

    int cost[] = new int[budget.length];
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < budget.length; i++) {
      cost[i] = budget[i] * (budget.length - i);
      // System.out.println("cost["+i+"] = "+budget[i]+" * "+(budget.length - i)+" =
      // "+cost[i]);
    }

    // System.out.println();

    for (int i = 0; i < cost.length; i++) {
      if (cost[i] > max) {
        max = cost[i];
      }
    }

    return max;

  }

}