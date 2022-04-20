package entity;

import factory.BlockFactory;
import interfaces.Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {


    private List<Block> blocks ;


    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }



    List<Block>  blocksList = BlockFactory.ArrayOfBlocks(10);



    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional findBlockByColor(String color) {
        List foundBlocksColor = new ArrayList();

        for (Block block : blocksList) {
            if (block.getColor() == color) {
                foundBlocksColor.add(block);
            }
        }
        return Optional.ofNullable(foundBlocksColor);
    }


    @Override
    public List findBlocksByMaterial(String material) {

        List foundBlocksMaterial = new ArrayList();
        for (Block block : blocksList) {
            if (block.getMaterial() == material) {
                foundBlocksMaterial.add(block);
            }
        }
        return foundBlocksMaterial;
    }


    @Override
    public int count() {
        return blocksList.size();
    }


}

