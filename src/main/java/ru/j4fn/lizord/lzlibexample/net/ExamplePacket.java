package ru.j4fn.lizord.lzlibexample.net;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import ru.j4fn.lizord.lzlib.net.AbstractPacket;
import ru.j4fn.lizord.lzlib.net.Serialize;

public class ExamplePacket extends AbstractPacket<ExamplePacket> {

    @Serialize
    public int integerValue;

    public ExamplePacket(){
        this(0);
    }

    public ExamplePacket(int value){
        super();
        this.integerValue = value;
    }

    public static class MessageHandler implements IMessageHandler<ExamplePacket, IMessage> {
        @Override
        public IMessage onMessage(ExamplePacket message, MessageContext ctx) {
            Minecraft.getMinecraft().addScheduledTask(() -> {
              Minecraft.getMinecraft().player.sendMessage(new TextComponentString("Your value: "+message.integerValue));
            });
            return null;
        }
    }
}
