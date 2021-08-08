package ru.j4fn.lizord.lzlibexample;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.j4fn.lizord.lzlib.util.ReflectionHelper;

@Mod(modid = "lzlibexample", dependencies = "required-after:lzlib")
public class LZLibExample{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        ReflectionHelper rh = new ReflectionHelper("gamehunt.lzlibexample.blocks", "gamehunt.lzlibexample.items");
        rh.constructClasses();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){

    }
}
