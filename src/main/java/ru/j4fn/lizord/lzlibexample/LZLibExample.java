package ru.j4fn.lizord.lzlibexample;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import ru.j4fn.lizord.lzlib.util.ReflectionHelper;
import ru.j4fn.lizord.lzlibexample.blocks.ExampleBlock;
import ru.j4fn.lizord.lzlibexample.net.NetworkManager;

@Mod(modid = "lzlibexample", dependencies = "required-after:lzlib")
public class LZLibExample{

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        logger = e.getModLog();
        ReflectionHelper rh = new ReflectionHelper("ru.j4fn.lizord.lzlibexample.blocks", "ru.j4fn.lizord.lzlibexample.items");
        rh.loadClasses();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        NetworkManager.Init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){

    }
}
