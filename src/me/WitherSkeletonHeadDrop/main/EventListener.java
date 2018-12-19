package me.WitherSkeletonHeadDrop.main;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class EventListener implements Listener {
	WitherSkeletonHeadDrop plugin;

	public EventListener(WitherSkeletonHeadDrop plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onEntityDeath(EntityDeathEvent event) {

		if (!(event.getEntity().getType() == EntityType.WITHER_SKELETON)) {
			return;
		}

		if (!(event.getEntity().getKiller() instanceof Player)) {
			return;
		}

		event.getDrops().add(new ItemStack(Material.WITHER_SKELETON_SKULL, 1));
	}
}
