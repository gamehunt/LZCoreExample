package ru.j4fn.lizord.lzlibexample;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import ru.j4fn.lizord.lzlibexample.net.ExamplePacket;
import ru.j4fn.lizord.lzlibexample.net.NetworkManager;

@Mod.EventBusSubscriber
public class EventHandler {
    @SubscribeEvent
    public static void OnJoin(PlayerEvent.PlayerLoggedInEvent e){
        if(!e.player.world.isRemote) {
            NetworkManager.INSTANCE.sendTo(new ExamplePacket(123), (EntityPlayerMP) e.player);
        }
    }
}
