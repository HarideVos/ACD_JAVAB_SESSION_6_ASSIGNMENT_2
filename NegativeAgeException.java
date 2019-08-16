package sixpointtwo;

public class NegativeAgeException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public NegativeAgeException (){
		super("You have to be alive to ride this ride");
	} 

}

