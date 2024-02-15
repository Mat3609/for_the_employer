package com.epam.tat.domainmodel.candies;

import com.epam.tat.domainmodel.giftbox.GiftBox;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Candy candy = new Candy("Alenka", 22);
        Candy candy2 = new Candy("Spartak", 13);
        Candy candy3 = new Candy("Stolichnaia", 8);
        Candy candy4 = new Candy("Bounty", 44);
        Candy candy5 = new Candy("Griliag", 38);

        GiftBox giftBox = new GiftBox();

        giftBox.addCandy(candy);
        giftBox.addCandy(candy2);
        giftBox.addCandy(candy3);
        giftBox.addCandy(candy4);
        giftBox.addCandy(candy5);




//        List<Candy> can = giftBox.findCandiesByNameStartedWith('S');
//
//
//        for (Candy cnd : can) {
//
//            System.out.println(cnd.getName());
//            System.out.println(cnd.getWeight());
//            System.out.println();
//        }

        giftBox.sortCandiesByNameAsc().stream ().forEach (candy1 -> System.out.println (candy1.toString ()));
    }
}
