package company;

public class Manager extends NaturalEmployee implements Bonus {

    @Override
    public void receiveBonus() {
        setMoney(getMoney() * 0.12);
    }
}
