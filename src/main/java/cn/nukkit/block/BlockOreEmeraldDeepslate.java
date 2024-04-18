package cn.nukkit.block;

public class BlockOreEmeraldDeepslate extends BlockOreEmerald {

    public BlockOreEmeraldDeepslate() {
        // Does nothing
    }

    @Override
    public int getId() {
        return DEEPSLATE_EMERALD_ORE;
    }

    @Override
    public double getHardness() {
        return 4.5;
    }

    @Override
    public String getName() {
        return "Deepslate Emerald Ore";
    }

}
