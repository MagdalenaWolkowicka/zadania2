package classes.zadanieKlasyAnonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Tree tree = new Tree();
            forest.add(tree);
        }


        Tree fromAnonymousClass = new Tree() {
            @Override
            public void display() {
                System.out.println("Magiczne drzewo");
            }
        };

        forest.add(fromAnonymousClass);
        Collections.shuffle(forest);

        for (Tree tree : forest) {
            tree.display();
        }


    }
}
