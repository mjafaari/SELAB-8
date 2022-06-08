package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import flowers.Flower;
import flowers.PersianFlower;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trees.PersianTree;
import trees.Tree;

public class PersianGardenTest {
    PersianFlower persianFlower = new PersianFlower("PersianFlower");
    PersianTree persianTree = new PersianTree("PersianTree");

    @Test
    @DisplayName("Simple test for creating Persian flower")
    void testCreateFlower(){
        Flower flower = persianFlower.copy();
        assertEquals(flower.getName(), "PersianFlower");
    }

    @Test
    @DisplayName("Simple test for creating Persian tree")
    void testCreateTree(){
        Tree tree = persianTree.copy();
        assertEquals(tree.getName(), "PersianTree");
    }
}