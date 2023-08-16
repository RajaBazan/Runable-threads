package hello.com;
class MythreadRunable1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<200){
            System.out.println("I'm Thread 1 not threat 1");
            i++;
        }
    }
}
class MythreadRunable2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<200){
            System.out.println("I'm Thread 2 not threat 2");
            i++;
        }
    }
}
public class Lec_71_runabale_thread {
    public static void main(String[] args) {


        MythreadRunable1 bullet1 = new MythreadRunable1();
        Thread Gun1 = new Thread(bullet1);
        MythreadRunable2 bullet2 = new MythreadRunable2();
        Thread Gun2 = new Thread(bullet2);

        Gun1.start();
        Gun2.start();
    }
}
