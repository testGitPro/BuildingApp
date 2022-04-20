package entity;

import factory.BlockFactory;
import interfaces.CompositeBlock;

import java.util.List;

public class Block implements CompositeBlock {

    private  long id;

    private String color;

    private String material;


    public Block(long id, String color, String material) {
        this.id = id;
        this.color = color;
        this.material = material;

    }


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List getBlocks() {
        List<Block> blocks = BlockFactory.ArrayOfBlocks(10);
        return blocks;
    }



}

