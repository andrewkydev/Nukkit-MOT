package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

public class BlockWallBrickDeepslate extends BlockWall {

    public BlockWallBrickDeepslate() {
        this(0);
    }

    public BlockWallBrickDeepslate(int meta) {
        super(meta);
    }
    
    @Override
    public int getId() {
        return DEEPSLATE_BRICK_WALL;
    }
    
    @Override
    public String getName() {
        return "Deepslate Brick Wall";
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
