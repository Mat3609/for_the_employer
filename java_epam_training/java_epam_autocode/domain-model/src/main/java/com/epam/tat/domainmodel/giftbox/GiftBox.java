package com.epam.tat.domainmodel.giftbox;

import com.epam.tat.domainmodel.candies.Candy;
import com.epam.tat.domainmodel.util.Finding;
import com.epam.tat.domainmodel.util.Sorting;

import java.util.*;
import java.util.stream.Collectors;


public class GiftBox implements Finding, Sorting {


    private List<Candy> candiesList;

    public GiftBox() {
        candiesList = new ArrayList<>();
    }

    public void addCandy(Candy candy) {
        this.candiesList.add(candy);
    }





    @Override
    public List<Candy> sortCandiesByNameAsc() {
//        Comparator<Candy> compareName = (o1, o2) -> o1.getName().compareTo(o2.getName());
//        Collections.sort(candiesList, compareName);
//        return candiesList;

        return candiesList.stream ()
                .sorted (Comparator.comparing (Candy :: getName).reversed())
                .collect(Collectors.toList());

    }


    @Override
    public List<Candy> sortCandiesByWeightAsc() {
        Comparator<Candy> candyCompareByWeight = (o1, o2) -> o1.getWeight() - o2.getWeight();
        Collections.sort(candiesList, candyCompareByWeight);
        return candiesList;
    }


    @Override
    public List<Candy> findCandiesByNameStartedWith(char candyNameFirstLetter) {
        List<Candy> newList = new ArrayList<>();
        for (int i = 0; i < candiesList.size(); i++) {
            if (candiesList.get(i).getName().charAt(0) == candyNameFirstLetter) {
                newList.add(candiesList.get(i));
            }
        }
        return newList;
    }


    @Override
    public List<Candy> findCandiesByWeightInRange(int weightFrom, int weightTo) {
        List<Candy> newList = new ArrayList<>();
        for (int i = 0; i < candiesList.size(); i++) {
            if (candiesList.get(i).getWeight() >= weightFrom && candiesList.get(i).getWeight() <= weightTo) {
                newList.add(candiesList.get(i));
            }
        }
        return newList;
    }
}
