package com.github.cmptrcharger.wordart;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import java.util.Arrays;
import java.util.Optional;

public class WordArtCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            World world = player.getWorld();
            Location location = player.getLocation();
            Optional<String> temp = Arrays.stream(args).reduce((s, s2) -> s+" "+s2);
            if(temp.isPresent()) {
                String str = temp.get();
                Vector direction = location.getDirection().normalize();
                ArmorStand armorstand = (ArmorStand)world.spawnEntity(location, EntityType.ARMOR_STAND);
                ItemStack head = new ItemStack(Material.EMERALD_BLOCK, 1);
                armorstand.setHelmet(head);
                armorstand.setVisible(false);
                for (int i = 0; i < str.length(); i++) {

                }
            }else{
                player.sendMessage(ChatColor.DARK_RED + "You must enter something!");
            }
        }else{
            sender.sendMessage("You must be a player!");
        }
        return false;
    }
}
