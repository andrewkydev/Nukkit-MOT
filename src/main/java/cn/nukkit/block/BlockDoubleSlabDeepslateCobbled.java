package cn.nukkit.block;

public class BlockDoubleSlabDeepslateCobbled extends BlockDoubleSlab {


    public BlockDoubleSlabDeepslateCobbled() {
        this(0);
    }

    public BlockDoubleSlabDeepslateCobbled(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return COBBLED_DEEPSLATE_DOUBLE_SLAB;
    }

    @Override
    public String getName() {
        return "Cobbled Deepslate";
    }
}
