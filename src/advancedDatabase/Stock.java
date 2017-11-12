package advancedDatabase;

import java.util.ArrayList;
import java.util.List;

public class Stock {
  public static void gen(int x) {
    List<Integer> out = new ArrayList<>();
    for (int i = 0; i < x; ++i) {
      out.add(i + 1);
    }
    permutate(out);
    printList(out, 0, x);
    int hold = x;
    while (x > 1) {
      x = (int)(0.3 * x);
      for (int i = 0; i < x; ++i) {
        out.add(out.get(i));
      }
      printList(out, hold + 1, hold + x);
      hold += x;
    }

    System.out.println(out);
  }

  private static void permutate(List<Integer> out) {
    for (int i = out.size() - 1; i >= 0; i--) {
      int pos = (int)(Math.random() * i);
      swap(out, i, pos);
    }
  }

  private static void swap(List<Integer> out, int i, int j) {
    int hold = out.get(i);
    out.set(i, out.get(j));
    out.set(j, hold);
  }

  private static void printList(List<Integer> out, int start, int end) {
    for (int i = start; i <= end; ++i) {
      System.out.print(out.get(i) + " ");
    }
    System.out.println();
  }
}
