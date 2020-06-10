package com.company.port;
//класс работы одного дока
public class Logic implements Runnable  {
    Thread thread;
    static int current = 0;

    Port port = new Port();
    static int docksIs = 1;

    Logic(String name) {
        thread = new Thread(this, name);
    }

    public static Logic createAndStart(String name) {
        Logic myThrd = new Logic(name);
        myThrd.thread.start(); // start the thread
        return myThrd;
    }

    @SuppressWarnings("static-access")
    synchronized public void run() {

        System.out.println(thread.getName() + " пришел в порт");
        try {
            for (int count = 0; count < 10; count++) {
                Ship ship = new Ship();

                while ((this.docksIs >= this.port.docks || current >= this.port.capacityPort)) {
                    System.out.println(thread.getName() + " вошел в порт и ожидает свободного места");
                    if (ship.bool) {
                        System.out.println("Корабль полон");
                    } else {
                        System.out.println("Корабль пуст");
                    }
                    Thread.sleep(40 + (int) (Math.random() * ((40 - 20) + 1)));
                }

                Thread.sleep(20 + (int) (Math.random() * ((40 - 20) + 1)));

                if (this.docksIs < (this.port.docks) && current < Port.capacityPort && ship.bool) {
                    System.out.println(
                            thread.getName() + " вошел в порт и начал разгрузку в доке " + "№" + (this.docksIs));

                    int doсks = this.docksIs;
                    this.docksIs++;
                    current += ship.capacity;

                    Thread.sleep(20 + (int) (Math.random() * ((40 - 20) + 1)));
                    System.out.println(thread.getName() + " завершил разгрузку" + " на причале №" + (doсks) + "\n"
                            + current + " контейнеров ");
                    Thread.sleep(20 + (int) (Math.random() * ((40 - 20) + 1)));
                    System.out.println(thread.getName() + " вышел из порта");
                    this.docksIs--;
                }

                while ((this.docksIs >= this.port.docks || current >= this.port.capacityPort)) {
                    System.out.println(thread.getName() + " вошел в порт и ожидает свободного места");

                    if (ship.bool) {
                        System.out.println("Полон");
                    } else {
                        System.out.println("Пуст");
                    }
                    Thread.sleep(40 + (int) (Math.random() * ((40 - 20) + 1)));
                }
                if (this.docksIs < port.docks && current > 10 && ship.capacity == 0) {
                    System.out.println(
                            thread.getName() + " вошел в порт и начал загрузку в доке" + " №" + (this.docksIs));

                    int doсks = this.docksIs;
                    this.docksIs++;
                    current -= 10;
                    Thread.sleep(20 + (int) (Math.random() * ((40 - 20) + 1)));

                    System.out.println(thread.getName() + " завершил загрузку " + " №" + (doсks) + "\nв порту " + current
                            + " контейнеров ");

                    Thread.sleep(20 + (int) (Math.random() * ((40 - 20) + 1)));

                    System.out.println(thread.getName() + " Вышел из порта ");
                    this.docksIs--;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thread.getName() + " ошибка старта.");
        }
    }
}
