package model;

public class ElementOperation {
	
	private int maxSize;
	private int sizeCounter = 0;
	private Integer ongoingElement = 1; 
	
	public ElementOperation(int maxSize) {
		this.maxSize = maxSize;
	}
	 
	public void printEmptySlotsAndElement() {
		System.out.print(maxSize - sizeCounter + " slots left --- " + ongoingElement);
		
	}
	
}
