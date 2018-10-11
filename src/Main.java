import java.util.ArrayList;
public class Main {
    public static void main(String a[]){

        ArrayList<String> listOfItemsToBuy = new ArrayList<>();

        listOfItemsToBuy.add("baldna milk");
        listOfItemsToBuy.add("mara3i milk");
        listOfItemsToBuy.add("chocolate milk");


        listOfItemsToBuy.add("Tomato vigis");
        listOfItemsToBuy.add("Cucumber vigis");

        listOfItemsToBuy.add("angus meat");
        listOfItemsToBuy.add("ribs meat");

        ArrayList<String> meatArrayList = new ArrayList<>();
        ArrayList<String> milkArrayList = new ArrayList<>();
        ArrayList<String> vigisArrayList = new ArrayList<>();

        for (String itemInsideListToBuy : listOfItemsToBuy) {

            itemInsideListToBuy = itemInsideListToBuy.toUpperCase();

            if(itemInsideListToBuy.contains("MILK")) {
                milkArrayList.add(itemInsideListToBuy);
            }else if (itemInsideListToBuy.contains("MEAT")) {
                meatArrayList.add(itemInsideListToBuy);
            } else if (itemInsideListToBuy.contains("VIGIS")){
                vigisArrayList.add(itemInsideListToBuy);
            }
        }


        meatArrayList.add("The list contains: " + meatArrayList.size());
        milkArrayList.add("The list contains: " + milkArrayList.size());
        vigisArrayList.add("The list contains: " + vigisArrayList.size());

        System.out.println(meatArrayList);
        System.out.println(milkArrayList);
        System.out.println(vigisArrayList);

    }

}
