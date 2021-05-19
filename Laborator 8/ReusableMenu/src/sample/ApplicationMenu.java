package sample;

import java.util.ArrayList;

import abstractions.IMenuItem;
import implementation.Menu;
import implementation.MenuItem;
import iowithplugins.IShape;
import plugins.PluginsManager;
import shapeManager.ShapeManager;



/**
 *
 * @author catalin
 */

public class ApplicationMenu{
    
    private PluginsManager pluginm;
    private Menu mainMenu = null;
    private Menu shapeMenu = null;
    private ShapeManager management = null;
    
    public ApplicationMenu(PluginsManager pluginm, ShapeManager management)
    {
          this.pluginm = pluginm;
          this.management = management;
    }
    
    public void loadMain()
    {
        ArrayList<IMenuItem> menuItems = new ArrayList();
        
        int shortCut = 1;    
        
         
       menuItems.add(new MenuItem("Adaugare forma geometrica", shortCut++, (parameters)->{
           shapeMenu.execute();
       }));  
       
       menuItems.add(new MenuItem("Sterge forma geometrica", shortCut++, (parameters)->{
           management.removeShape();
       })); 
       
       menuItems.add(new MenuItem("Vizualizare plansa", shortCut++, (parameters)->{
           management.printShapes();
       })); 
       
       menuItems.add(new MenuItem("Editeaza forma geometrica", shortCut++, (parameters)->{
           management.printShapes();
           management.editShape();
       })); 
       
        
        mainMenu = new Menu("Main Menu", -1, menuItems);
        
    }
    
    public void load()
    {
        pluginm.loadPlugins("/plugins");
        ArrayList<IMenuItem> menuItems = new ArrayList();
        
        int shortCut = 1;
        var plugins = pluginm.getPluginsList();
        
        for (int i = 0 ; i < plugins.size(); i++)
        {      
           var currentPlugin = plugins.get(i); 
           MenuItem currentItem = new MenuItem(plugins.get(i).getDisplayText(), shortCut++, (parameters)->{
               IShape shape = currentPlugin.getShape();
               management.addShape(shape);
           });
           menuItems.add(currentItem);
       
        }
       shapeMenu=new Menu("Add new shape",1,menuItems);
       this.loadMain();
     
    }
    
    public void execute()
    {
        mainMenu.execute();
    }
    
}