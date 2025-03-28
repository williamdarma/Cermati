package Data;

public class SavedData {

    private static String savedString;

    private static int lowPriceFilter, highPriceFilter;
    private static String conditionFilter;
    private static String locationFilter;


    public static String GetString() {
        return savedString;
    }

    public void SetString(String s) {
        this.savedString = s;
    }

    public static String GetConditionFilter() {

       int returnValue = 0;
        System.out.println("saved condition filter "+ conditionFilter);
        switch (conditionFilter.toLowerCase())
        {
            case "new":
                returnValue = 1000;
                break;
            case "open box":
                returnValue = 1500;
                break;
            case "used":
                returnValue = 3000;
                break;
            case "for parts or not working":
                returnValue = 7000;
                break;
        }
        return "LH_ItemCondition=" + returnValue;
    }

    public static String GetItemLocation() {

        int returnValue = 0;
        System.out.println("saved location filter "+ locationFilter);
        switch (locationFilter.toLowerCase())
        {
            case "us only":
                returnValue = 3;
                break;
            case "north america":
                returnValue = 4;
                break;
            case "europe":
                returnValue = 5;
                break;
            case "asia":
                returnValue = 6;
                break;
        }
        return "LH_PrefLoc=" + returnValue;
    }

    public static String GetLowpriveFilter() {return "_udlo="+lowPriceFilter;}

    public static String GetHighpriveFilter() {return "_udhi="+highPriceFilter;}

    public void SetConditionFilter(String s) {
        this.conditionFilter = s;
    }

    public void SetPriceRangeFilter(int low, int high) {
        this.lowPriceFilter = low;
        this.highPriceFilter = high;
    }

    public void SetLocationFilter(String s){

        this.locationFilter = s;

    }
}
