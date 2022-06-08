package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import flowers.Flower;
import flowers.JapaneseFlower;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trees.JapaneseTree;
import trees.Tree;

public class JapaneseGardenTest {
    JapaneseFlower japaneseFlower = new JapaneseFlower("JapaneseFlower");
    JapaneseTree japaneseTree = new JapaneseTree("JapaneseTree");

    @Test
    @DisplayName("Simple test for creating japanese flower")
    void testCreateFlower(){
        Flower flower = japaneseFlower.copy();
        assertEquals(flower.getName(), "JapaneseFlower");
    }

    @Test
    @DisplayName("Simple test for creating japanese tree")
    void testCreateTree(){
        Tree tree = japaneseTree.copy();
        assertEquals(tree.getName(), "JapaneseTree");
    }
}
