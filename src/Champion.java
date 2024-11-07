public class Champion {
    private String name;
    private int life, attack, armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion otherChampion){
        if(this.armor >= otherChampion.getAttack()) { //significa que o dano seria igual a 0, e como dito no enunciado, independente da armadura o campeão deve levar ao menos 1 de dano
            this.setLife(this.getLife() - 1);
        } else {
            this.setLife((this.getLife() - otherChampion.getAttack()) + this.getArmor());
        }
    }

    public String status(){
        if(this.life <= 0){
            return this.name + ": 0 de vida (morreu)";
        }
        return this.name + ": " + this.life + " de vida";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
