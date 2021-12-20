package techtoolbox.television;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter  {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        System.out.println("asdfasdfasddddddddddddddddddd");

        if (args[0].equalsIgnoreCase(Television.prefix + "info")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Television Bot Information");
            info.setDescription("Completely useless information about a useless bot called 'television'");
//            info.addField("Creator", "techtoolbbox", false);
            info.setColor(0xc957c4);
            info.setFooter("Created by techtoolbox", event.getMember().getUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();

            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }

    }

}
