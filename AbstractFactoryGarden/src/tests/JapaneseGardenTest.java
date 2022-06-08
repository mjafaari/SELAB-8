package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import factories.JapaneseGardenFactory;
import flowers.AbstractFlower;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trees.AbstractTree;

public class JapaneseGardenTest {
    JapaneseGardenFactory factory = new JapaneseGardenFactory();

    @Test
    @DisplayName("Simple test for creating japanese flower")
    void testCreateFlower(){
        AbstractFlower flower = factory.createFlower();
        assertEquals(flower.getName(), "JapaneseFlower");
    }

    @Test
    @DisplayName("Simple test for creating japanese tree")
    void testCreateTree(){
        AbstractTree tree = factory.createTree();
        assertEquals(tree.getName(), "JapaneseTree");
    }
}
