package interfaces.example1;

import oop.examples.Viber;

public class Yacht extends Vehicle implements SpecialSignal{

    Integer length_feet;

    public Yacht(String producer, Integer length_feet) {
        super(producer);
        this.length_feet = length_feet;
    }

    public void upSail(){}

    @Override
    public void signal() {
        System.out.println("radio signal!!!");
    }
}

/*
Vehicle -> сухопутное или морское

Сухопутное -> колесное или гусенечное


Если мы строим иерархию наших классов, то чтобы в авто, мото и яхте были какие-то общие методы, то нам надо "поднять" эти методы на самый верх.
А значит И ВСЕ ОСТАЛЬНЫЕ классы будут у себя иметь эти методы и либо нам надо будет придумывать им реализацию, либо они будут пустые

Мы не сможем создать массив в котором будут объекты у которых реализованы наши "специальные методы"
Мы сможем создать массив vehicle и в него добавить объекты
 */
