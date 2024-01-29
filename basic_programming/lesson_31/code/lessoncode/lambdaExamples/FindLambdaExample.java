package lambdaExamples;

public class FindLambdaExample {
    public static void main(String[] args) {
        // создать ссылку на NOccurences

        IFindItem ref;

        // Сформировать лямбду

        ref = ((item, array) -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (item.equals(array[i])) {
                    count++;
                }
            }
            return count;
        });

        //---- create array ------

        String[] arrayString = {"abc","def","abc","ghi","fjk","def","abc","abc","def","abc","def"};


        FindItem findItem = new FindItem();
        int count = findItem.find("abc", arrayString, ref);

        System.out.println("count = " + count);

        //  int count2 = ref.NOccurences("def", arrayString);

    }
}
