package sample;

import plugins.PluginsManager;
import shapeManager.ShapeManager;

public class MainReusableMenu {

	public static void main(String[] args) {
		PluginsManager plugin = new PluginsManager();
		ShapeManager management =new ShapeManager();
		
		ApplicationMenu menu = new ApplicationMenu(plugin, management);
		menu.load();
		menu.execute();

	}

}