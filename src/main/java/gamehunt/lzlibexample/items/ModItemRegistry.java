package gamehunt.lzlibexample.items;

import gamehunt.lzlib.blocks.BlockRegistry;
import gamehunt.lzlib.items.ItemRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
