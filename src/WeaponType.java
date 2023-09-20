enum WeaponType {
    SWORD,
    AXE,
    BOW
}


class Weapon {
    private WeaponType weaponType;
    private String weaponName;

   
    public Weapon(WeaponType weaponType, String weaponName) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }


    public WeaponType getWeaponType() {
        return weaponType;
    }


    public String getWeaponName() {
        return weaponName;
    }


    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}

class GameEntity {
    private int health;
    private int damage;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}


class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}







