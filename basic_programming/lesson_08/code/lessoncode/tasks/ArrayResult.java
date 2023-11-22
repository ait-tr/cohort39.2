package tasks;

public class ArrayResult {

    private int maxElement;
    private int indexOfMaxElement;

    public ArrayResult(int maxElement, int indexOfMaxElement) {
        this.maxElement = maxElement;
        this.indexOfMaxElement = indexOfMaxElement;
    }

    public int getMaxElement() {
        return maxElement;
    }

    public int getIndexOfMaxElement() {
        return indexOfMaxElement;
    }

    public void setMaxElement(int maxElement) {
        this.maxElement = maxElement;
    }

    public void setIndexOfMaxElement(int indexOfMaxElement) {
        this.indexOfMaxElement = indexOfMaxElement;
    }
}
