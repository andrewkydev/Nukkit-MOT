package cn.nukkit.block;

public class BlockOreDiamondDeepslate extends BlockOreDiamond {

    public BlockOreDiamondDeepslate() {

    }

    @Override
    public int getId() {
        return DEEPSLATE_DIAMOND_ORE;
    }

    @Override
    public double getHardness() {
        return 4.5;
    }

    @Override
    public String getName() {
        return "Deepslate Diamond Ore";
    }

}
