package techtoolbox.television;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import techtoolbox.television.commands.Clear;

import javax.security.auth.login.LoginException;

public class Television {

    public static JDA jda;
    public static String prefix = "~";


    public static void main(String[] args) throws LoginException {

        String token = "OTIyNDgzNTEyNjgxMDUwMTQy.YcCHuA.Q-gnK7bANrOmmdFyR-DtE8mJst4";
        jda = JDABuilder.createDefault(token).build();

        //jda.getPresence().setStatus(OnlineStatus.IDLE);

        if(jda.getPresence().isIdle()) {
            System.out.println("Server is IDLE");
        } else {
            System.out.println("Server is NOT IDLE");
        }

        jda.addEventListener(new Clear());

        //jda.getPresence().setStatus(OnlineStatus.IDLE);

//        jda.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
//
//        jda.setBulkDeleteSplittingEnabled(false);
//
//        jda.setCompression(Compression.NONE);
//
//        jda.setActivity(Activity.playing("Television"));

        //jda.enableIntents(GatewayIntent.GUILD_MEMBERS);

        //jda.build();


    }
}
