public class ListMerge {
    private int[] firstPart;
    private int[] secondPart;
    private int[] mergedList;


    public ListMerge(int[] firstPart, int[] secondPart) {
        this.firstPart = firstPart;
        this.secondPart = secondPart;
        this.mergedList = new int[firstPart.length + secondPart.length];
        int k=0;
        int i=0;
        int j=0;
        while (true) {
            if (i<firstPart.length && j<secondPart.length) {
                if (firstPart[i] <  secondPart[j]) {
                    mergedList[k]=firstPart[i];
                    k++;
                    i++;
                } else {
                    mergedList[k] = secondPart[j];
                    k++;
                    j++;
                }
            } else if (i<firstPart.length) {
                mergedList[k]=firstPart[i];
                k++;
                i++;
                break;
            } else if (j<secondPart.length) {
                mergedList[k]=secondPart[j];
                k++;
                j++;
                break;
            } else {
                break;
            }


        }



    }

    public int[] getMergedList() {
        return mergedList;
    }

    public void showFirstPart() {
        for (int i = 0; i < firstPart.length; i++) {
            System.out.println(firstPart[i]);
        }
    }

    public void showSecondPart() {
        for (int i = 0; i < secondPart.length; i++) {
            System.out.println(secondPart[i]);
        }
    }

    public void showMergedList() {
        System.out.println("Length is: " + mergedList.length);
        for (int i = 0; i < mergedList.length; i++) {
            System.out.println(mergedList[i]);
        }
    }
}
