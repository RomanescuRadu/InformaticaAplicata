package circle;

import iowithplugins.IIOPlugin;
import iowithplugins.IShape;

public class CirclePlugin implements IIOPlugin {
	
	@Override
	public String getName()
	{
		return "Circle";
	}
	
	@Override
	public IShape getShape()
	{
		return new Circle();
	}
	
	 @Override
	    public String getDisplayText() {
	        return "Circle";
	    }

}
