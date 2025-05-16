package rpg.trainer;

public class Hero {
    private final CharacterStats stats;

    public Hero() {
        this.stats = new CharacterStats();
    }

    public String viewStats() {
        return "Strength: " + stats.str + "\n" +
               "Intelligence: " + stats.intel + "\n" +
               "Agility: " + stats.agi;
    }

    public void trainStr() {
        if (stats.str < 10) {
            stats.str++;
            System.out.println("Trained Strength! It is now " + stats.str);
        } else {
            System.out.println("Strength is already maxed out!");
        }
    }

    public void trainIntel() {
        if (stats.intel < 10) {
            stats.intel++;
            System.out.println("Trained Intelligence! It is now " + stats.intel);
        } else {
            System.out.println("Intelligence is already maxed out!");
        }
    }

    public void trainAgi() {
        if (stats.agi < 10) {
            stats.agi++;
            System.out.println("Trained Agility! It is now " + stats.agi);
        } else {
            System.out.println("Agility is already maxed out!");
        }
    }
}
