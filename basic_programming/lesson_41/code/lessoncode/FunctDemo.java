public class FunctDemo {
    public static void main(String[] args) {

        SimpleFuncInterface fi = new SimpleFuncInterface() {
            @Override
            public void doWork() {
                System.out.println("Выполняется работа метода");
            }
        };

        fi.doWork();
    }
}
