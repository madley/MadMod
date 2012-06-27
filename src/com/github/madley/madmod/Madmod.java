package com.github.madley.madmod;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
//import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.java.JavaPlugin;

public class Madmod extends JavaPlugin {

	public void onEnable(){
		
		getLogger().info("[Madmod] onEnable");
	}
	public void onDisable(){
		
		getLogger().info("[Madmod] onDisable");
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	
    	getLogger().info("[Madmod] onCommand: "+label );
    	
    	for(int a = 0; a < args.length; a++ ){
    		
    		getLogger().info("[Madmod] "+label+" arg"+a+": "+args[a] );
    	}
    	
    	if( cmd.getName().equalsIgnoreCase("ackmad") ){
    		
    		Player player = null;
        	if (sender instanceof Player){
        		
        		player = (Player) sender;
        	}
        	
        	if (player == null) {
    			sender.sendMessage("this command can only be run by a player");
    		} 
    		else {
    			
    			//give madley admin
    			//PermissionAttachment attachment = player.addAttachment(this);
    			//attachment.setPermission( "ackmad", true );
    			
    			//getLogger().info("[Madmod] madley given ackmad perms");
    		}
        	
    	}
    
    	
//    	
     
//    	if ( cmd.getName().equalsIgnoreCase("basic") ){ // If the player typed /basic then do the following...
//    		// do something...
//    		//getLogger().info("Madmod: basic called");
//    		
//    		getLogger().info("Madmod: args"+args[0] );
//    		return true;
//    	}
//    	
//    	
//    	else if (cmd.getName().equalsIgnoreCase("basic2")) {
//    		
//    		if (player == null) {
//    			sender.sendMessage("this command can only be run by a player");
//    		} 
//    		else {
//    			// do something else...
//    			getLogger().info("Madmod: basic2 called");
//    		}
//    		return true;
//    	}
    	
    	return false;
    }





}
