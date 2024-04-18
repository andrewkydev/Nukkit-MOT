package cn.nukkit.block;

import cn.nukkit.item.Item;

public class BlockOreRedstoneDeepslateGlowing extends BlockOreRedstoneDeepslate {

    public BlockOreRedstoneDeepslateGlowing() {

    }

    @Override
    public int getId() {
        return LIT_DEEPSLATE_REDSTONE_ORE;
    }

    @Override
    public String getName() {
        return "Glowing Deepslate Redstone Ore";
    }

    @Override
    public int getLightLevel() {
        return 9;
    }

    @Override
    public Item toItem() {
        return new BlockOreRedstoneDeepslate().toItem();
    }
}
