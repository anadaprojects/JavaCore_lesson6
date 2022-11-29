package Task1;

public class Main {
    public static void main(String[] args) {
      WorkerHours wh= new WorkerHours(250,8);
      WorkerMonths wm= new WorkerMonths(30,1000);
      wm.salary();
      wh.salary();
    }
}