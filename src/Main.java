import java.util.List;

public class Main {
    //NumberList numberList = new NumberList();
    //int[] mainNumberList = numberList.getNumberList();

    CustomList nwcustomer = new CustomList(200000);
    int [] customList = nwcustomer.getCustomList();

    public static void main(String[] args) {
        new Main().run();
    }

    public void run(){
        long startTime = System.currentTimeMillis();

       //firstAssignment();
       //secondAssignment();
      thirdAssignment();

        long endTime = System.currentTimeMillis();
        System.out.println("Project spent " + (endTime - startTime) + "ms");
    }

    public void splitArray(int[] arr, int threshold) {

        ListDivider listDivider = new ListDivider(arr);
        int[] firstArr = listDivider.getFirstList();
        int[] secondArr = listDivider.getSecondList();
        if (firstArr.length>threshold && secondArr.length>threshold) {
            splitArray(firstArr,threshold);
            splitArray(secondArr,threshold);
        }
    }

    public void firstAssignment(){

        Sorter sorter1 = new Sorter(customList);
        Thread thread1 = new Thread(sorter1);
        thread1.start();
        try{
            thread1.join();
        }catch (InterruptedException e){
        }
    }

    public void secondAssignment(){
        ListDivider listDivider = new ListDivider(customList);
        Sorter sorter1 = new Sorter(listDivider.getFirstList());
        Sorter sorter2 = new Sorter(listDivider.getSecondList());
        Thread thread1 = new Thread(sorter1);
        Thread thread2 = new Thread(sorter2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            } catch (InterruptedException e) {
            }
            ListMerge listMerge = new ListMerge(listDivider.getFirstList(), listDivider.getSecondList());
    }

    public void thirdAssignment(){
        //   for (int i=0;i<mainNumberList.length;i++) {
        //       System.out.println(mainNumberList[i]);
        //   }

        RecursiveSplit recursiveSplit = new RecursiveSplit(customList,200000);
        Thread thread = new Thread(recursiveSplit);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
        }

        //  recursiveSplit.showResult();
    }
}