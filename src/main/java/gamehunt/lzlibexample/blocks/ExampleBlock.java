package gamehunt.lzlibexample.blocks;

import gamehunt.lzlib.blocks.AbstractBlock;
import gamehunt.lzlib.util.RegistryEntry;
import net.minecraft.block.material.Material;

@RegistryEntry
public class ExampleBlock extends AbstractBlock {
    public ExampleBlock() {
        super("example_block", Material.GROUND);
    }
}
