package cn.nukkit.block;

public class BlockOreIronDeepslate extends BlockOreIron {

    public BlockOreIronDeepslate() {

    }

    @Override
    public int getId() {
        return DEEPSLATE_IRON_ORE;
    }

    @Override
    public double getHardness() {
        return 4.5;
    }

    @Override
    public String getName() {
        return "Deepslate Iron Ore";
    }

}
