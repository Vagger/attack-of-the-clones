import examples.Knight;
import examples.Quest;
import examples.Antagonist;
import utils.CloneUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Antagonist sazar = new Antagonist("Sazar", "Thedeos", 50);
        Antagonist sazarClone = (Antagonist) CloneUtils.deepCopy(sazar);
        System.out.println(sazar);
        System.out.println(sazarClone);
        System.out.println("----------------------------");

        Antagonist modest = new Antagonist("Modest", "Gottfehlt", 30);
        modest.setAge(50);
        Antagonist modestClone = (Antagonist) CloneUtils.deepCopy(modest);
        System.out.println(modest);
        System.out.println(modestClone);
        System.out.println("----------------------------");

        Antagonist dorman = new Antagonist("Dorman", "Daddara", 30);
        System.out.println(dorman);
        dorman.setAge(50);
        dorman.setName("A Dead person");
        dorman.setLastName("Probably?");
        Antagonist dormanClone = (Antagonist) CloneUtils.deepCopy(dorman);
        System.out.println(dorman);
        System.out.println(dormanClone);
        System.out.println("----------------------------");

        Knight grenk = new Knight("Grenk Thedeos", 25, List.of("The Three Guardians", "Toys and Puppets"));
        Knight grenkClone = (Knight) CloneUtils.deepCopy(grenk);
        System.out.println(grenk);
        System.out.println(grenkClone);
        System.out.println("----------------------------");

        Quest quest = new Quest(grenkClone, dormanClone);
        System.out.println(quest);
        Quest anotherQuest = (Quest) CloneUtils.deepCopy(quest);
        System.out.println(anotherQuest);
        quest.setAntagonist(modestClone);
        Quest yetAnotherQuest = (Quest) CloneUtils.deepCopy(quest);
        System.out.println(yetAnotherQuest);
    }
}