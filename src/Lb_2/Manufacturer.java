package Lb_2;

public class Manufacturer {
    private int i = 0;

    public void produce(Storage st) throws InterruptedException {
        while (true) {
            synchronized (st.getLock()) {
                while (st.getQueue().size() == st.getLimit()) {
                    st.getLock().wait();
                }
                Products mf = new Products(i);
                st.getQueue().offer(mf);
                System.out.println("Произведен " + mf);
                i++;
                st.getLock().notify();
            }
        }
    }
}