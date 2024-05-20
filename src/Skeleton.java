public class Skeleton extends Boss {
    private int arrowCount;

    public Skeleton(String name, int health, int attackPower, Weapon weapon, int arrowCount) {
        super(name, health, attackPower, weapon);
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Arrow Count: " + arrowCount);
    }
}
