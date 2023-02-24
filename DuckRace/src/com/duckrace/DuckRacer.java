package com.duckrace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class DuckRacer {
    private final int id;
    private String name;
//  private int wins;
    private final List<Reward> rewards = new ArrayList<>();

    //constuctor
    public DuckRacer(int id, String name) {
        this.id = id;
        setName(name);
    }

    //action method
    public void win(Reward reward) {
        rewards.add(reward);
    }

    //Accessor methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //a derived property
    public int getWins() {
       return rewards.size();
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    //toString
    @Override
    public String toString() {
        return String.format("%s: id=%s, name=%s, wins=%s, rewards=%s",
                getClass().getSimpleName(), getId(), getName(), getWins(), getRewards());
    }
}