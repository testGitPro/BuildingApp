package factory;



import entity.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlockFactory {
    static public long id = 0;

    static public Block generateArrayOfBlocks() {
        Random random = new Random();

        // colors
        String[] AllColors = {"red", "black", "grey", "white", "yellow"};
        String color = AllColors[random.nextInt(AllColors.length)];

        // materials
        String[] AllMaterials = {"GasBlock", "FoamBlock", "KeramsiteBlock", "ArboliteBlock"};
        String material = AllMaterials[random.nextInt(AllMaterials.length)];

        return new entity.Block(id++, color, material);
    }



    static public  List<Block> ArrayOfBlocks(int amount) {

        List<Block> listBlocks = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            listBlocks.add(generateArrayOfBlocks());

        }
        return listBlocks;
    }
}

