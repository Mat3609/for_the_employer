package com.epam.tat.domainmodel.candies;

/**
 * Class Description:
 * Extend class 'com.epam.tat.domainmodel.candies.Candy' from abstract class 'com.epam.tat.domainmodel.candies.CandyBase',
 * implement constructor om.epam.tat.domainmodel.candies.Candy() with two arguments:
 * 'name' as String, 'weight' as int,
 * override and implement get() and set() methods by default and
 * put this class into package 'com.epam.tat.domainmodel.candies'.
 * <p>
 */
public class Candy extends CandyBase {



    private String nameCandy;
    private int weightCandy;

    public Candy(String name, int weight) {
        this.nameCandy = name;
        this.weightCandy = weight;
    }

    /**
     * No actions are required within the method getName
     */
    @Override
    public String getName() {
        return nameCandy;
    }

    /**
     * No actions are required within the method setName
     */
    @Override
    public void setName(String name) {
        this.nameCandy = name;
    }

    /**
     * Implement method getWeight which
     * returns class variable 'weight'
     */
    @Override
    public int getWeight() {
        return weightCandy;
    }


    @Override
    public void setWeight(int weight) {
        this.weightCandy = weight;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "nameCandy='" + nameCandy + '\'' +
                ", weightCandy=" + weightCandy +
                '}';
    }
}
