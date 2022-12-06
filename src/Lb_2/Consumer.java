package Lb_2;

public class Consumer {
    public void consume(Storage st) throws InterruptedException {
        while (true) {
            synchronized (st.getLock()) {

                while (st.getQueue().size() == 0) {
                    st.getLock().wait();
                }
                Products mf = st.getQueue().poll();
                System.out.println(mf + " взят со склада");
                System.out.println("Количество продуктов на складе: " + st.getQueue().size());
                st.getLock().notify();
            }

            Thread.sleep(2000);
        }
    }
}