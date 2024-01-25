package entity;

public class NumbersFrequentWords {
    Integer maxFrequency;
    Integer minFrequency;

    public NumbersFrequentWords(Integer maxFrequency, Integer minFrequency) {
        this.maxFrequency = maxFrequency;
        this.minFrequency = minFrequency;
    }

    public Integer getMaxFrequency() {
        return maxFrequency;
    }

    public Integer getMinFrequency() {
        return minFrequency;
    }
}
