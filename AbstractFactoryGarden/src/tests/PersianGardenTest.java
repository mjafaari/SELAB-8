package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import factories.PersianGardenFactory;
import flowers.AbstractFlower;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trees.AbstractTree;

public class PersianGardenTest {
    PersianGardenFactory factory = new PersianGardenFactory();

    @Test
    @DisplayName("Simple test for creating Persian flower")
    void testCreateFlower(){
        AbstractFlower flower = factory.createFlower();
        assertEquals(flower.getName(), "PersianFlower");
    }

    @Test
    @DisplayName("Simple test for creating Persian tree")
    void testCreateTree(){
        AbstractTree tree = factory.createTree();
        assertEquals(tree.getName(), "PersianTree");
    }
}
