package ru.j4fn.lizord.lzlibexample.multiblocks.example;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.Vec3i;
import ru.j4fn.lizord.lzlib.multiblocks.IMultiblockPattern;

public class ExampleMultiblockPattern implements IMultiblockPattern {

    public static final ExampleMultiblockPattern INSTANCE = new ExampleMultiblockPattern();

    @Override
    public char[][][] getPattern() {
        return new char[][][] {
                {
                        {'x','x','x'},
                        {'x','x','x'},
                        {'x','x','x'},
                },
                {
                        {'x','d','x'},
                        {'x','@','x'},
                        {'x','x','x'},
                },
                {
                        {'x','x','x'},
                        {'x','x','x'},
                        {'x','x','x'},
                },
        };
    }

    @Override
    public Block getBlockFor(char c) {
        switch(c){
            case 'x':
                return Blocks.COBBLESTONE;
            case '@':
                return Blocks.AIR;
            case 'd':
                return Blocks.FURNACE;
        }
        return Blocks.AIR;
    }

    @Override
    public int getSizeX() {
        return 3;
    }

    @Override
    public int getSizeY() {
        return 3;
    }

    @Override
    public int getSizeZ() {
        return 3;
    }

    @Override
    public Vec3i getTriggerOffset() {
        return new Vec3i(1,1,0);
    }
}
