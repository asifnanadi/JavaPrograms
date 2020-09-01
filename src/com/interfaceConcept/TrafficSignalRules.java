package com.interfaceConcept;

public interface TrafficSignalRules {
	
	public void RedLine();
	
	public void GreenLine();
	
	public void YellowLine();
	
	public void zeebraCrossing();
	
	public default void handSignal() {
		
	}	

}
