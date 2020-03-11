package ProblemaGameHero;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setViata(100);
        hero.setPuteredeAtac(10);
        System.out.println("Hero life is:" + hero.getViata());
        NonPlayerCharacter enemy = new NonPlayerCharacter();
        enemy.setViata(100);
        enemy.setPuteredeAtac(5);
        System.out.println("Enemy life is:" + enemy.getViata());
enemy.atack(hero);
hero.atack(enemy);
        System.out.println(hero.getViata());
        System.out.println(enemy.getViata());
    }
}
