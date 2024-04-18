package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

public class BlockWallDeepslatePolished extends BlockWall {

    public BlockWallDeepslatePolished() {
        this(0);
    }

    public BlockWallDeepslatePolished(int meta) {
        super(meta);
    }
    
    @Override
    public int getId() {
        return POLISHED_DEEPSLATE_WALL;
    }
    
    @Override
    public String getName() {
        return "Polished Deepslate Wall";
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
