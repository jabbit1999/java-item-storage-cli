package com.minijava.common;

/**
 * 모든 등급의 합이 100이 되어야한다.
 */
public enum RankGachaProbability {
    NORMAL(80),
    RARE(19),
    LEGENDARY(1);

    private final int probability;

    RankGachaProbability(int probability) {
        this.probability = probability;
    }

    public int getProbability() {
        return probability;
    }
}
