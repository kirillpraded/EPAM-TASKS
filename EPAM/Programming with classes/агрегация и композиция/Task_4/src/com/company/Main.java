package com.company;
//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.



public class Main {

    public static void main(String[] args) {
        Bank simpleBank = new Bank("Худший банк - БСБ Банк");

        Customer firstCustomer = new Customer("Олег Юрьевич", "AR4W5G34");
        Customer secondCustomer = new Customer("Юрий Николаевич", "KC5E2C24");

        simpleBank.addNewClient(firstCustomer);
        simpleBank.addNewClient(secondCustomer);

        firstCustomer.addAccount(new Account(250));
        firstCustomer.addAccount(new Account(-50));
        firstCustomer.addAccount(new Account(1024));

        secondCustomer.addAccount(new Account(432));
        secondCustomer.addAccount(new Account(-2));
        secondCustomer.addAccount(new Account(12));

        System.out.println(simpleBank.getClient("AR4W5G34").getAccount(1).getStatus());
        simpleBank.getClient("AR4W5G34").blockAccount(1);
        System.out.println(simpleBank.getClient("AR4W5G34").getAccount(1).getStatus() + "\n");
    }
}
