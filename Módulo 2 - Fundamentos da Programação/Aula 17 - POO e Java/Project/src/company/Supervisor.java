package company;

public class Supervisor extends NaturalEmployee implements Bonus {

    @Override
    public void receiveBonus() {
        setMoney(getMoney() * 0.08);
    }
}
