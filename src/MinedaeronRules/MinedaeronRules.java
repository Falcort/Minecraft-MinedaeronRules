package MinedaeronRules;

import org.bukkit.plugin.java.JavaPlugin;

public class MinedaeronRules extends JavaPlugin
{
	public void onEnable()
	{
		this.getCommand("regles").setExecutor(new ReglesCommand());
	}
}
