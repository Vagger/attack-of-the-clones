package examples;

public class Quest {

    private Knight knight;

    private Antagonist antagonist;

    public Quest(Knight knight, Antagonist antagonist) {
        this.knight = knight;
        this.antagonist = antagonist;
    }

    public Knight getKnight() {
        return knight;
    }

    public void setKnight(Knight knight) {
        this.knight = knight;
    }

    public Antagonist getAntagonist() {
        return antagonist;
    }

    public void setAntagonist(Antagonist antagonist) {
        this.antagonist = antagonist;
    }

    @Override
    public String toString() {
        return knight.getName() + " on a quest to find and kill " + antagonist.getName();
    }
}
