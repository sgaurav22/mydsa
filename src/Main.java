import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  static class FastScanner {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    String next() {
      while (!st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    int[] readArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = nextInt();
      }
      return a;
    }

    long nextLong() {
      return Long.parseLong(next());
    }
  }

  public static void main(String[] args) {
    // Capture user input
    FastScanner fc = new FastScanner();
    int size = fc.nextInt();
    String arr1 = fc.next();
    String arr2 = fc.next();

    System.out.println(extracted(arr1, arr2));
    // get each element
  }

  private static String extracted(String arr1, String arr2) {
    arr1 = arr1.replaceAll("1", "l");
    arr1 = arr1.replaceAll("0", "o");
    arr2 = arr2.replaceAll("1", "l");
    arr2 = arr2.replaceAll("0", "o");

    if (arr1.equals(arr2)) return "Yes";
    else return "No";
  }
}
