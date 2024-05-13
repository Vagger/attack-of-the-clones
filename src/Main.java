import examples.Man;
import examples.User;
import utils.CloneUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        User modest = new User("Modest", "Gottfehlt", 50);
        User modestClone = (User) CloneUtils.deepCopy(modest);
        System.out.println(modestClone);

        Man grenk = new Man("Grenk Thedeos", 25, List.of("The Three Guardians", "Toys and Puppets"));
        Man grenkClone = (Man) CloneUtils.deepCopy(grenk);
        System.out.println(grenkClone);
    }
}