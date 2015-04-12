package me.bukkit.SoTotallyXray;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MyFirstPlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info("§5SoTotallyPlugin Has Been §6ENABLED");
	}
	@Override
	public void onDisable() {
		getLogger().info("§5SoTotallyPlugin Has Been §6DISABLED");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if (cmd.getName().equalsIgnoreCase("Hello") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage("Hello, " + player.getName() + "!");
			
			return true;
		}
		
		
		return false;
		
	}

}
