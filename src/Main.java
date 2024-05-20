public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");

        Boss boss = new Boss("Dark Lord", 500, 80, bossWeapon);
        boss.printInfo();

        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Longbow");
        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Crossbow");

        Skeleton skeleton1 = new Skeleton("Skeleton Archer", 100, 30, skeletonWeapon1, 50);
        Skeleton skeleton2 = new Skeleton("Skeleton Sniper", 120, 35, skeletonWeapon2, 60);

        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}
