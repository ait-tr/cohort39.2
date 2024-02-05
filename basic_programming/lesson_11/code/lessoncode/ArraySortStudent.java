import studetnAndBook.Student;

public class ArraySortStudent {

    public void bubbleSortName(Student[] workingArray){
        boolean notSorted = true;
        Student temp;

        while (notSorted) {

            notSorted = false;
            for (int i = 0; i < workingArray.length - 1; i++) {
                String currentStudentName =  workingArray[i].getName();
                String nextStudentName =  workingArray[i+1].getName();

                if (currentStudentName.compareTo(nextStudentName) > 0) {
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i + 1];
                    workingArray[i + 1] = temp;
                    notSorted = true;

                }
            }
        }

    }

    public void bubbleSortGroup(Student[] workingArray){
        boolean notSorted = true;
        Student temp;

        while (notSorted) {

            notSorted = false;
            for (int i = 0; i < workingArray.length - 1; i++) {
                String currentStudentGroup =  workingArray[i].getGroup();
                String nextStudentGroup =  workingArray[i+1].getGroup();

                if (currentStudentGroup.compareTo(nextStudentGroup) > 0) {
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i + 1];
                    workingArray[i + 1] = temp;
                    notSorted = true;

                }
            }
        }

    }


    public void bubbleSortById(Student[] workingArray){
        boolean notSorted = true;
        Student temp;

        while (notSorted) {

            notSorted = false;
            for (int i = 0; i < workingArray.length - 1; i++) {
                int currentStudentId =  workingArray[i].getId();
                int nextStudentId =  workingArray[i+1].getId();

                if (currentStudentId > nextStudentId) {
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i + 1];
                    workingArray[i + 1] = temp;
                    notSorted = true;

                }
            }
        }

    }

}
