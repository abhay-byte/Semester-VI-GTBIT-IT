class EvenThread extends Thread {
    int num;

    void set() {
        this.num = 0;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                even();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("INTERRUPTED EXCEPTION ");
            }
        }
    }

    void even() {
        num = num + 2;
        System.out.println("Even : " + num);
    }
}

class OddThread implements Runnable {
    int num;

    void set() {
        this.num = 1;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                odd();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("INTERRUPTED EXCEPTION ");
            }
        }
    }

    void odd() {
        num = num + 2;
        System.out.println("Odd : " + num);
    }
}

class JavaLab {
    public static void main(String a[]) {
        int i;
        EvenThread et = new EvenThread();
        OddThread ot = new OddThread();
        Thread t = new Thread(ot);
        et.set();
        ot.set();
        et.start();
        t.start();
        System.out.println("Abhay Raj, 00976803122" );
    }
}