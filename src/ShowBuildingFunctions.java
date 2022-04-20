import entity.Block;
import entity.Wall;

import java.util.List;
import java.util.Optional;

public class ShowBuildingFunctions {

        List<Block> blocks ;

        Wall wall = new Wall(blocks);

        public ShowBuildingFunctions() {


            List bloksList = wall.findBlocksByMaterial("GasBlock");

            Optional o = wall.findBlockByColor("white");

            int count = wall.count();

        }
    }


