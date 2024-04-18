package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

public class BlockWallTileDeepslate extends BlockWall {

    public BlockWallTileDeepslate() {
        this(0);
    }

    public BlockWallTileDeepslate(int meta) {
        super(meta);
    }
    
    @Override
    public int getId() {
        return DEEPSLATE_TILE_WALL;
    }
    
    @Override
    public String getName() {
        return "Deepslate Tile Wall";
    }
    
    @Override
    public double getHardness() {
        return 3.5;
    }
    
    @Override
    public double getResistance() {
        return 6;
    }
    
    @Override
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }

}
