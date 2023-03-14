package dev.jake.taskzombie;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.swing.text.html.parser.Entity;

public class ZombieStat implements Listener {

    @EventHandler
    public void zombieEqiup(EntitySpawnEvent event) {
        if (event.getEntity() instanceof Zombie) {
            Zombie zombie = (Zombie) event.getEntity();

            zombie.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
            zombie.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
            zombie.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
            zombie.getEquipment().setBoots(new ItemStack(Material.IRON_BOOTS));

            zombie.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_AXE));

            zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 3));

            zombie.setCustomName(ChatColor.translateAlternateColorCodes('&', "&c&lСильный зомби"));
        }
    }
}
