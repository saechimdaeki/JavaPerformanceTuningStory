package chap08;

public class RunThreads {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        ThreadExtends thread = new ThreadExtends();
        new Thread(runnable).start();
        thread.start();
    }
}
