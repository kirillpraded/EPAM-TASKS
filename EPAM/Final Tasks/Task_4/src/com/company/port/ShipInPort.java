package com.company.port;

public class ShipInPort {
    private static Logic logic1;
    private static Logic logic2;
    private static Logic logic3;
    private static Logic logic4;
    private static Logic logic5;

    public static void main(String args[]) {
        System.out.println("Начало работы порта");
        setLogic1(Logic.createAndStart("Корабль 1"));
        setLogic2(Logic.createAndStart("Корабль 2"));
        setLogic3(Logic.createAndStart("Корабль 3"));
        setLogic4(Logic.createAndStart("Корабль 4"));
        setLogic5(Logic.createAndStart("Корабль 5"));

        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println("Поток прерван");
            }
        }
    }

    public static Logic getLogic1() {
        return logic1;
    }

    public static void setLogic1(Logic l1) {
        ShipInPort.logic1 = l1;
    }

    public static Logic getLogic2() {
        return logic2;
    }

    public static void setLogic2(Logic l2) {
        ShipInPort.logic2 = l2;
    }

    public static void setLogic3(Logic l3) {
        ShipInPort.logic3 = l3;
    }

    public static Logic getLogic3() {
        return logic3;
    }

    public static void setLogic4(Logic l4) {
        ShipInPort.logic4 = l4;
    }

    public static Logic getLogic4() {
        return logic4;
    }

    public static void setLogic5(Logic l5) {
        ShipInPort.logic5 = l5;
    }

    public static Logic getLogic5() {
        return logic5;
    }


}
