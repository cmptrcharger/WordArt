package com.github.cmptrcharger.wordart;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Optional;

public class WordArtCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            Location l = p.getLocation();
            Optional<String> temp = Arrays.stream(args).reduce((s, s2) -> s+" "+s2);
            if(temp.isPresent()) {
                String str = temp.get();
                for (int i = 0; i < str.length(); i++) {
                    Letters.toArray(str.charAt(i));
                }
            }else{
                p.sendMessage(ChatColor.DARK_RED + "You must enter something!");
            }
        }else{
            sender.sendMessage("You must be a player!");
        }
        return false;
    }
}
