
public class Menu {
    Command command;
    public void takeCommand(Command command) {
    	this.command=command;
    }


   public void placeCommand() { 
    command.execute();
  }



}
