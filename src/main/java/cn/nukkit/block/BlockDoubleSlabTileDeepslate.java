package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

public class BlockDoubleSlabTileDeepslate extends BlockDoubleSlab {

    public BlockDoubleSlabTileDeepslate() {
        this(0);
    }

    protected BlockDoubleSlabTileDeepslate(int meta) {
        super(meta);
    }
    
    @Override
    public int getId() {
        return DEEPSLATE_TILE_DOUBLE_SLAB;
    }
    
    @Override
    public String getName() {
        return "Double Deepslate Tile Slab";
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
    public boolean canHarvestWithHand() {
        return false;
    }
    
    @Override
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }
    
    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

}
