package hashSetWithIncorrectHashCodeFunction;

import java.util.Objects;

public class CustomItem {
    private String value;

    public CustomItem(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomItem{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomItem that = (CustomItem) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        //Все экземпляры CustomItem будут иметь одинаковый хеш-код
        return 1;
    }
}
