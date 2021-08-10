package ru.j4fn.lizord.lzlibexample.net;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class NetworkManager {
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("lzlibexample");
    public static void Init(){
        INSTANCE.registerMessage(ExamplePacket.MessageHandler.class, ExamplePacket.class, 0, Side.CLIENT);
    }
}
