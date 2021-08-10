package ru.j4fn.lizord.lzlibexample.multiblocks.example;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import ru.j4fn.lizord.lzlib.multiblocks.AbstractMultiblock;
import ru.j4fn.lizord.lzlib.multiblocks.IMultiblockPattern;

public class ExampleMultiblock extends AbstractMultiblock {
    public static final ExampleMultiblock INSTANCE = new ExampleMultiblock();
    @Override
    public IMultiblockPattern getPattern() {
        return ExampleMultiblockPattern.INSTANCE;
    }

    @Override
    public boolean construct(World world, BlockPos blockPos, EntityPlayer entityPlayer) {
        if(!world.isRemote){
            entityPlayer.sendMessage(new TextComponentString("Multiblock constructed!"));
        }
        return true;
    }
}
