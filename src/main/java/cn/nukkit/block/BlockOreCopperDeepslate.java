package cn.nukkit.block;


public class BlockOreCopperDeepslate extends BlockOreCopper {

    public BlockOreCopperDeepslate() {

    }

    @Override
    public String getName() {
        return "Deepslate Copper Ore";
    }

    @Override
    public int getId() {
        return DEEPSLATE_COPPER_ORE;
    }

    @Override
    public double getHardness() {
        return 4.5;
    }

}
