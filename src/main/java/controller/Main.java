package controller;

/**
 *
 * @author Yelson Monge
 */
public class Main {
    
    public static void main(String[] args) {
        SavesController controller = new SavesController();
        controller.insertSave("Casa", 40);
        controller.insertSave("Carro", 15);
        controller.insertSave("Emergencias", 20);
        controller.splitSaves(536000);
    }
    
}
