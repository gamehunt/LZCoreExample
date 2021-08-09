package ru.j4fn.lizord.lzlibexample.blocks;


import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import ru.j4fn.lizord.lzlib.blocks.AbstractBlock;
import ru.j4fn.lizord.lzlib.util.RegistryEntry;

@RegistryEntry
public class ExampleBlock extends AbstractBlock {
    public final static ExampleBlock INSTANCE = new ExampleBlock();
    public ExampleBlock() {
        super("example_block", Material.GROUND);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
