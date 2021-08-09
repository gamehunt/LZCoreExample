package ru.j4fn.lizord.lzlibexample.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import ru.j4fn.lizord.lzlib.blocks.AbstractBlock;
import ru.j4fn.lizord.lzlib.blocks.AbstractTileEntity;
import ru.j4fn.lizord.lzlib.util.RegistryEntry;

@RegistryEntry
public class ExampleTEBlock extends AbstractBlock {
    public final static ExampleTEBlock INSTANCE = new ExampleTEBlock();
    public ExampleTEBlock() {
        super("example_te_block", Material.GROUND);
    }
    @Override
    public Class<? extends AbstractTileEntity> getTileEntityClass(IBlockState s) {
        return ExampleTE.class;
    }
}
