package gamehunt.lzlibexample.blocks;

import gamehunt.lzlib.blocks.AbstractBlock;
import gamehunt.lzlib.blocks.AbstractTileEntity;
import gamehunt.lzlib.util.RegistryEntry;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

@RegistryEntry
public class ExampleTEBlock extends AbstractBlock {
    public ExampleTEBlock() {
        super("example_te_block", Material.GROUND);
    }

    @Override
    public Class<? extends AbstractTileEntity> getTileEntityClass(IBlockState s) {
        return ExampleTE.class;
    }
}
