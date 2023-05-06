package Task10;

public class testPhilosophers {
    public static void main(String[] args) {
//        Filosofi person1 = new Filosofi(1);
//        Filosofi person2 = new Filosofi(2);
//        Filosofi person3 = new Filosofi(3);
//        Filosofi person4 = new Filosofi(4);
//        Filosofi person5 = new Filosofi(5);
        Table table = new Table();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                if (table.palka1) {
                    table.palka1 = false;
                    System.out.println("Первый взял левую ");
                }
                if (table.palka5) {                     // ?? как долго держать правую палку??
                    table.palka5 = false;
                    System.out.println("Первый взял правую .Теперь он ест ");
                    table.palka1 = true;
                    table.palka5 = true;
                    System.out.println("Первый поел и положил палки  ");
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                if (table.palka2) {
                    table.palka2 = false;
                    System.out.println("Второй взял левую ");
                }
                if (table.palka1) {                         // ?? как долго держать правую палку??
                    table.palka1 = false;
                    System.out.println("Второй взял правую .Теперь он ест ");
                    table.palka2 = true;
                    table.palka1 = true;
                    System.out.println("Второй поел и положил палки  ");
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                if (table.palka3) {
                    table.palka3 = false;
                    System.out.println("Третий взял левую ");
                }
                if (table.palka2) {                     // ?? как долго держать правую палку??
                    table.palka2 = false;
                    System.out.println("Третий взял правую .Теперь он ест ");
                    table.palka3 = true;
                    table.palka2 = true;
                    System.out.println("Третий поел и положил палки  ");
                }
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                if (table.palka4) {
                    table.palka4 = false;
                    System.out.println("Четвертый взял левую ");
                }
                if (table.palka3) {           // ?? как долго держать правую палку??
                    table.palka3 = false;
                    System.out.println("Четвертый взял правую .Теперь он ест ");
                    table.palka4 = true;
                    table.palka3 = true;
                    System.out.println("Четвертый поел и положил палки  ");
                }
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    this.wait();
//                } catch (InterruptedException e) {
//                    System.out.println("Пятый захватил поток перед взятием левой");
//                }
                if (table.palka5) {
                    table.palka5 = false;
                    System.out.println("Пятый взял левую ");
                }
//                    if (!table.palka4) {            //??что делать если правой палки нет .думаю положить левую???????
//                      //  this.notify();
//                        table.palka5 = true;
//                        System.out.println("Пятый положил левую т.к. нет правой");
//                    }
                if (table.palka4) {           // ?? как долго держать правую палку??
                    table.palka4 = false;
                    System.out.println("Пятый взял правую .Теперь он ест ");
                    table.palka5 = true;
                    table.palka4 = true;
//                        this.notify();
//                        System.out.println("Пятый поел и отдал поток  ");
                    System.out.println("Пятый поел и положил палки  ");
                }
            }
        });




               try {

                thread1.start();
                thread2.start();
                thread3.start();
                thread4.start();
                thread5.start();
                thread1.join();
                thread2.join();
                thread3.join();
                thread4.join();
                thread5.join();


        } catch (
                InterruptedException e) {
//            e.printStackTrace();
        }

//        System.out.println("Ну че наелись");


    }


}
