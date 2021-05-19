package rectangle;


import iowithplugins.IIOPlugin;
import iowithplugins.IShape;

public class RectanglePlugin implements IIOPlugin{
	
	@Override
	public String getName()
	{
		return "Rectangle";
	}
	
	@Override
	public IShape getShape()
	{
		return new Rectangle();
	}
	 @Override
	    public String getDisplayText() {
	        return "Rectangle";
	    }

}
