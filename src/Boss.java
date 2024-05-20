public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(String name, int health, int attackPower, Weapon weapon) {
        super(name, health, attackPower);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Attack Power: " + getAttackPower());
        System.out.println("Weapon: " + weapon.getName() + " (" + weapon.getType() + ")");
    }
}
