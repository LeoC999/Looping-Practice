public class ForLoop {
    public static void main(String[] args)throws InterruptedException {
      for (int i = 5; i >= 1; i--)
      {Thread.sleep(1000);
          System.out.println(i);
          if (i <= 1)
              System.out.print("Launch!");
        }

    }
}
