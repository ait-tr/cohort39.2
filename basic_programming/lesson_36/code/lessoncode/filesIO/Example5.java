package filesIO;

import java.io.File;
import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        boolean isExist = file.exists();
        System.out.println("Does file exist> " + isExist);

        //----------

        File dir = new File("new_dir");
        boolean wasCreate = dir.mkdir();

        System.out.println("Directory was create? " + wasCreate);


        // ---------

        File directory = new File("new_dir");
        boolean isDir = directory.isDirectory();
        System.out.println(isDir);

        //----------

//        boolean success = directory.delete();
//        System.out.println(success);

        String[]  filenames = directory.list();
        File[] files = directory.listFiles();

        System.out.println(Arrays.toString(filenames));

        System.out.println(Arrays.toString(files));


    }
}
