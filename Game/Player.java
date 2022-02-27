import Arsenal.*;

class Player {
    private final Weapon[] weapons;

    public Player(Weapon[] weapons) {
        this.weapons = weapons;
    }

    public int getSlotsCount() {
        return weapons.length;
    }

    // public void shotWithWeapon(int slot) {
    //    weapons[slot].shot();
    // }

    public void shotWithWeapon(int slot) {
        Weapon weapon = weapons[slot];
        weapon.shot();
    }
}