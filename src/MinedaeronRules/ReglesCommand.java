package MinedaeronRules;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class ReglesCommand implements CommandExecutor
{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
			BookMeta bm = (BookMeta) book.getItemMeta();
			
			bm.setPages(Arrays.asList("THIS IS MY BOOK", "THIS ISNT MY BOOK§"));
			bm.setAuthor("MineDaeron Staff");
			bm.setTitle("Regles du serveur MineDaeron");
			
			book.setItemMeta(bm);
			((Player) sender).getInventory().addItem(book);
		}
		else
		{
			sender.sendMessage("Tu dois etre un joueur pour utiliser cette commande");
		}
		return true;
	}
}
