package rpg.trainer;


public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        StatTrainer trainer = new StatTrainer(hero);
        trainer.start();
    }
}
