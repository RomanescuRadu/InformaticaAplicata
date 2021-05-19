package triangle;

import iowithplugins.IIOPlugin;
import iowithplugins.IShape;

public class TrianglePlugin implements IIOPlugin{
	
	@Override
	public String getName()
	{
		return "triangle";
	}
	
	@Override
	public IShape getShape()
	{
		return new Triangle();
	}
	 @Override
	    public String getDisplayText() {
	        return "Triangle";
	    }

}
