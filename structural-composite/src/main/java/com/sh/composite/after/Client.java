package com.sh.composite.after;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);
        Item sword = new Item("보검", 1000);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);
        bag.add(sword);

        Bag innerBag = new Bag();
        innerBag.add(new Item("축지슈", 200));
        innerBag.add(new Item("발다프리크향 손수건", 150));
        bag.add(innerBag);

        Client client = new Client();
        client.printPrice(doranBlade); // 450
        client.printPrice(bag); // 1850
    }

    /**
     * 아이템의 가격을 출력
     * @param component
     */
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }



}
