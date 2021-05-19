package square;

import iowithplugins.IIOPlugin;
import iowithplugins.IShape;


public class SquarePlugin implements IIOPlugin {
	@Override
	public String getName()
	{
		return "Square";
	}
	
	@Override
	public IShape getShape()
	{
		return new Square();
	}
	 @Override
	    public String getDisplayText() {
	        return "Square";
	    }
}
