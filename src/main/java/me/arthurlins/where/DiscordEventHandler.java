package me.arthurlins.where;

import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class DiscordEventHandler extends ListenerAdapter {

    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        if(event.isFromType(ChannelType.GROUP)){
            event.getTextChannel().sendMessage("j");
        }
        //super.onMessageReceived(event);
    }
}
