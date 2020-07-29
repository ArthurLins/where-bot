package me.arthurlins.where;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("NzM4MTQzMzk5ODI3NDcyMzg0.XyHnnA.-lnN3ARSyH38azknn0LSNi5e1jg");
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        builder.setBulkDeleteSplittingEnabled(false);
        builder.addEventListeners(new DiscordEventHandler());
        builder.build();
    }

}
