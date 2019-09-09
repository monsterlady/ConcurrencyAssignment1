public class Sorter implements Runnable {

    private int[] listToSort;

    public Sorter(int[] listToSort) {
        this.listToSort=listToSort;
    }

    @Override
    public void run() {
        System.out.println("Start sorting!");
        for (int pos = 0; pos < listToSort.length; pos++) {
            int temp = listToSort[pos];
            int minIndex = pos;
            for (int index = pos + 1; index < listToSort.length; index++) {
                if (listToSort[index] < temp) {
                    temp = listToSort[index];
                    minIndex = index;
                }
            }
            if (minIndex != pos) {
                listToSort[minIndex] = listToSort[pos];
                listToSort[pos] = temp;
            }
        }

    }

    public void showResult() {
        for (int i = 0; i < listToSort.length; i++) {
            System.out.println(listToSort[i]);
        }
    }
}
