package webPageContainers;

public class TriangleResult {
	//TODO - LF Exercise 4 
	//Changing from public to private data members.  Getters/setters created to manipulate these data members.
	private String side1;
	private String side2;
	private String side3;
	private String category;
	private String coordinates;
	
	/**
	 * Constructor initializes data for this data bean
	 * @param side1
	 * @param side2
	 * @param side3
	 * @param category
	 * @param coordinates
	 */
	public TriangleResult (String side1, String side2,String side3,String category,String coordinates){
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
		setCategory(category);
		setCoordinates(coordinates);
		
	}
	
	public void setSide1 (String side1){
		this.side1 = side1;
	}
	public void setSide2 (String side2){
		this.side2 = side2;
	}
	public void setSide3 (String side3){
		this.side3 = side3;
	}
	public void setCategory (String category){
		this.category = category;
	}
	public void setCoordinates (String coordinates){
		this.coordinates = coordinates;
	}
	
	
	
	public String getSide1 (){
		return side1;
	}
	public String getSide2 (){
		return side2;
	}
	public String getSide3 (){
		return side3;
	}
	public String getCategory (){
		return category;
	}
	public String getCoordinates (){
		return coordinates;
	}
	
	
}
