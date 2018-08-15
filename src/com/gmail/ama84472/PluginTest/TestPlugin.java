package com.gmail.ama84472.PluginTest;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import commands.TestCommand;

public class TestPlugin extends JavaPlugin{

	public void onEnable() {
		
		System.out.println("Test Plugin Initialized");
		this.getCommand("test1").setExecutor((CommandExecutor)new TestCommand());
	}
	
	public void onDisable() {
		
	}
	
}
