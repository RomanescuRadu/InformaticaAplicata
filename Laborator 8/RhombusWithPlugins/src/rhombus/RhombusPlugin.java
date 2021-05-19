package rhombus;

import iowithplugins.IIOPlugin;
import iowithplugins.IShape;


public class RhombusPlugin implements IIOPlugin {
	@Override
	public String getName()
	{
		return "Rhombus";
	}
	
	@Override
	public IShape getShape()
	{
		return new Rhombus();
	}
	 @Override
	    public String getDisplayText() {
	        return "Rhombus";
	    }
}
