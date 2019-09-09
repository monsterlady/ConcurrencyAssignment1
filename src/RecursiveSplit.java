public class RecursiveSplit implements Runnable {

    private int[] arr;
    private int threshold;

    public RecursiveSplit(int[] arr, int threshold) {
        this.arr=arr;
        this.threshold=threshold;
    }


    @Override
    public void run() {
         if (arr.length>threshold) {
             ListDivider listDivider = new ListDivider(arr);
             int[] firstArr = listDivider.getFirstList();
             int[] secondArr = listDivider.getSecondList();

             RecursiveSplit splitArr1 = new RecursiveSplit(firstArr,threshold);
             RecursiveSplit splitArr2 = new RecursiveSplit(secondArr,threshold);

            Thread t1 = new Thread(splitArr1);
            Thread t2 = new Thread(splitArr2);

            t1.start();
            t2.start();



            Sorter sorter1 = new Sorter(firstArr);
            Sorter sorter2 = new Sorter(secondArr);

            Thread t3 = new Thread(sorter1);
            Thread t4 = new Thread(sorter2);

            t3.start();
            t4.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {

            }
            arr = new ListMerge(firstArr,secondArr).getMergedList();
        } else {
            Sorter sorter = new Sorter(arr);

            Thread thread = new Thread(sorter);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {

            }
        }

    }

    public void showResult() {
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
