public class ListDivider {
    private int[] listToDivide = NumberList.numberList;
    private int[] firstList;
    private int[] secondList;

    public ListDivider(int[] listToDivide) {
        firstList = new int[listToDivide.length / 2];
        secondList = new int[listToDivide.length - firstList.length];

        for (int i = 0; i < listToDivide.length; i++) {
            if (i < listToDivide.length / 2) {
                firstList[i] = listToDivide[i];
            } else {
                secondList[i - (listToDivide.length / 2)] = listToDivide[i];
            }
        }
    }

    public int[] getFirstList() {
        return firstList;
    }

    public int[] getSecondList() {
        return secondList;
    }

    public void setFirstList(int[] firstList) {
        this.firstList = firstList;
    }

    public void setSecondList(int[] secondList) {
        this.secondList = secondList;
    }
}
