package practice.flat;

public class Flat implements Comparable<Flat> {
    private double area;
    private int bedrooms;

    public Flat(double area, int bedrooms) {
        this.area = area;
        this.bedrooms = bedrooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "area=" + area +
                ", bedrooms=" + bedrooms +
                '}';
    }

    @Override
    public int compareTo(Flat other) {
        //сначала сортировка по количеству спален, затем по площади
        if (bedrooms != other.getBedrooms()) return bedrooms - other.getBedrooms();
        else return Double.compare(area, other.getArea());
    }
}
