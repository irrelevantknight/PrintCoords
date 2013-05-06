//Package info
package com.irrelevantknight.printcoords;

//Imports
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

//Start class
public final class PrintCoords extends JavaPlugin
{
	//On plugin enable
	@Override
    public void onEnable()
	{
		//Register the command
		getCommand("coords").setExecutor(new CommandListener());
		
		//Get the plugin description and use it for an enable message
		PluginDescriptionFile pdfFile = this.getDescription();
		getLogger().info(pdfFile.getName() + " version " + pdfFile.getVersion() + " has been enabled.");
    }
 
	//On plugin disable
    @Override
    public void onDisable()
    {
    	//Get the plugin description and use it for a disable message
		PluginDescriptionFile pdfFile = this.getDescription();
		getLogger().info(pdfFile.getName() + " has been disabled.");
    }
}