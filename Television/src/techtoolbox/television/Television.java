package techtoolbox.television;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

public class Television {
	public static JDABuilder jda;
	
	public static void main(String[] args) throws LoginException {
		jda = JDABuilder.createDefault("OTIyNDgzNTEyNjgxMDUwMTQy.YcCHuA.lkCYlPQi0vpdU8i_RKReO672BKI");
		
		//jda.getPresence().set
	}
}
