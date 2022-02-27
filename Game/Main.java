import Arsenal.Pistol;
import Arsenal.RPG;
import Arsenal.WaterGun;
import Arsenal.Weapon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(new Weapon[] {
                new WaterGun(), new Pistol(), new RPG()
        });
        System.out.format(
                "У игрока %d слота(ов) с оружием, введите номер, чтобы выстреливать, -1 чтобы выйти\n",
                player.getSlotsCount()
        );

        int slot;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot - 1);
        }
    }
}