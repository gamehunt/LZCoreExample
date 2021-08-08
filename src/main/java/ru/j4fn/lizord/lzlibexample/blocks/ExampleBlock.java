package ru.j4fn.lizord.lzlibexample.blocks;


import net.minecraft.block.material.Material;
import ru.j4fn.lizord.lzlib.blocks.AbstractBlock;
import ru.j4fn.lizord.lzlib.util.RegistryEntry;

@RegistryEntry
public class ExampleBlock extends AbstractBlock {
    public ExampleBlock() {
        super("example_block", Material.GROUND);
    }
}
