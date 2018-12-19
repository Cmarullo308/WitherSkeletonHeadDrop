package me.WitherSkeletonHeadDrop.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import me.WitherSkeletonHeadDrop.main.EventListener;

public class WitherSkeletonHeadDrop extends JavaPlugin {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		return true;
	}

	@Override
	public void onDisable() {
	}

	@Override
	public void onEnable() {

		this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
		super.onEnable();
	}
}
