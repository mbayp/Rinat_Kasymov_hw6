public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Demon Sword");


        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(100);
        boss.setWeapon(bossWeapon);


        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Weapon Type: " + boss.getWeapon().getWeaponType());
        System.out.println("Weapon Name: " + boss.getWeapon().getWeaponName());
    }
}
