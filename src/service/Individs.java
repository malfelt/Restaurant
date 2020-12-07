package service;

import model.*;

public class Individs {
    private Person person;
    public boolean checkPreferences(Product product) {
        if (product.getClass() == Salad.class) {
            if (!person.getPreferences().isEatSeaFood() && ((Salad) product).isSeaFood()) {
                return false;
            }
        }
        if (product.getClass() == Drink.class) {
            if (!person.getPreferences().isDrinkAlcohol() && ((Drink) product).isAlcohol()) {
                return false;
            }
        }
        if (product.getClass() == MainDish.class) {
            if (!person.getPreferences().isEatMeat() && ((MainDish) product).isMeat()) {
                return false;
            }
        }
        return true;
    }

    public boolean checkTime(int productTime){
        if (person.getFreeTime() < productTime){
            return false;
        }
        return true;
    }
    public boolean checkMoney(int price){
        if (person.getMoney() < price){
            return false;
        }
        return true;
    }
}
