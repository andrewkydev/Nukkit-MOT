package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

public class BlockSlabTileDeepslate extends BlockSlab {

    public BlockSlabTileDeepslate() {
        this(0);
    }

    public BlockSlabTileDeepslate(int meta) {
        super(meta, DEEPSLATE_TILE_SLAB);
    }
    
    @Override
    public int getId() {
        return DEEPSLATE_TILE_SLAB;
    }
    
    @Override
    public String getName() {
        return "Deepslate Tile";
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
