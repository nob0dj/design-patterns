package com.sh.composite.before;

import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);
        Item sword = new Item("보검", 1000);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);
        bag.add(sword);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    /**
     * 아이템의 가격을 출력
     * @param item
     */
    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    /**
     * 가방안의 아이템 가격의 총합을 출력
     */
    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);

        // 3번째 combiner는 병렬스트림전용으로 나눠 작업한 것을 합칠때 호출된다. 일반스트림에서는 호출되지 않는다.
        sum = bag.getItems().stream().reduce(0, (total, item) -> total + item.getPrice(), (n, m) -> n + m);
        System.out.println(sum);

        sum = bag.getItems().parallelStream().reduce(0, (total, item) -> total + item.getPrice(), (n, m) -> {
            System.out.printf("combiner called! %d, %d%n", n, m);
            return n + m;
        });
        System.out.println(sum);

        sum = bag.getItems().stream().map(Item::getPrice).reduce(0, (total, price) -> total + price);
        System.out.println(sum);
    }

}
