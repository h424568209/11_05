public class test {
    public static class zs implements Runnable{
        public void run(){
            while(true){
                System.out.println("qqqqqqq");
            }
        }
    }
    public static class ls implements Runnable{
        public void run(){
            while(true){
                System.out.println("wwwwwww");
                Thread.yield();
            }
        }
    }
    public static void main(String[] args) {
      Thread zs = new Thread(new zs());
      Thread ls = new Thread(new ls());
      zs.start();
        try {
            zs.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ls.start();

    }
}
