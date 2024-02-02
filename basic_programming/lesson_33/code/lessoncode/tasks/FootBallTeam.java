package tasks;

import java.util.Objects;

class FootBallTeam implements Comparable<FootBallTeam> {
    private String name;
    private int power;

    public FootBallTeam(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public FootBallTeam(String name) {
        this.name = name;
        this.power = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return name + ": " + power;
    }

    // либо можно создать свой compareTo метод для sort
    @Override
    public int compareTo(FootBallTeam o) {

        if (o == null)
            throw new NullPointerException();

        if (name.equals(o.getName())) {
            if (power > o.getPower())
                return 1;
            else if (power < o.getPower())
                return -1;
            else
                return 0;
        } else
            return name.compareTo(o.getName());
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootBallTeam that = (FootBallTeam) o;
        return power == that.power && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }

}