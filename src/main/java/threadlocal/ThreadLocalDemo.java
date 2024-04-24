package threadlocal;

public class ThreadLocalDemo {

  public static void main(String[] args) throws InterruptedException {
    MyRunnable sharedRunnableInstance = new MyRunnable();

    Thread thread1 = new Thread(sharedRunnableInstance);
    Thread thread2 = new Thread(sharedRunnableInstance);

    thread1.start();
    thread2.start();
  }

  public static class MyRunnable implements Runnable {

    //private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
    private ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial( () -> {return 10;});

    @Override
    public void run() {
      threadLocal.set( 100 );
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
      }

      System.out.println(threadLocal.get());
    }
}
}