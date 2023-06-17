package controller;

import java.util.HashMap;
import model.Saves;

/**
 *
 * @author Yelson Monge
 */
public class SavesController {
    private HashMap <String, Saves> savesMap = new HashMap <String,Saves>();

    public SavesController() {
    }
    
    public int calculatePercent(int amount, int percent){
        System.out.println(amount/100*percent);
        System.out.println(Math.round(amount/100*percent));
        return Math.round(amount/100*percent);
    }
    
    public void splitSaves(int amount){
        for(String key : savesMap.keySet()){
            int saveAmount = calculatePercent(amount, savesMap.get(key).getPercent());
            savesMap.get(key).addValue(saveAmount);
            System.out.println(savesMap.get(key).getName() + ": ₡" + savesMap.get(key).getValue());
        }
    }
    
    public void insertSave(String name, int percent){
        Saves save = new Saves(name, percent);
        savesMap.put(name, save);
    }
    
}
