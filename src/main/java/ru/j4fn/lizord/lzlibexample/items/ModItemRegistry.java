package ru.j4fn.lizord.lzlibexample.items;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import ru.j4fn.lizord.lzlib.items.ItemRegistry;

@Mod.EventBusSubscriber
public class ModItemRegistry {
    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> e){
        ItemRegistry.registerModItems(e.getRegistry(), "lzlibexample");
    }
    @SubscribeEvent
    public static void onModelRegistry(ModelRegistryEvent e){
        ItemRegistry.registerModItemModels("lzlibexample");
    }
}
