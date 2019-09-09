public class CustomList {

    private int[] customList;

    public CustomList(int sizeofList) {
        this.customList =  new int[sizeofList];
        for(int i =0; i < sizeofList; i++){
            int randomNum = (int)(Math.random()* 100);
           // System.out.println(randomNum + " ");
            customList[i] = randomNum;
        }

    }

    public int[] getCustomList() {
        return customList;
    }


}
