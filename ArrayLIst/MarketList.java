package ArrayLIst;

import java.util.ArrayList;

public class MarketList {
    private ArrayList<String> marketList = new ArrayList<String>();

    public ArrayList<String> getMarketList() {
        return marketList;
    }

    public void addItem(String item){
        marketList.add(item);
    }

    public void printLIst(){
        System.out.println("You have " + marketList.size() + " items");
        for(int i = 0;i<marketList.size();i++){
            System.out.println((i+1) +". " + marketList.get(i));
        }
    }

    public void modifyItems(int position,String newItem){
        marketList.set(position, newItem);
        System.out.println("Market item has been modified.POsition at " + (position+1));
    }

    public  void removeItem(int position){

        marketList.remove(position);
    }

    public String findItem (String searchItem){
     //   boolean exist = marketList.contains(searchItem);
        int position = marketList.indexOf(searchItem);
        if (position >= 0){
            return marketList.get(position);
        }
        return null;

    }
}
