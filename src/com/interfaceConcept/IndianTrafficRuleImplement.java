package com.interfaceConcept;

public class IndianTrafficRuleImplement implements TrafficSignalRules, VehicleParts{

	public static void main(String[] args) {	
		TrafficSignalRules tr=new IndianTrafficRuleImplement();
		tr.RedLine();
		tr.GreenLine();
		tr.YellowLine();
		
		IndianTrafficRuleImplement horn=new IndianTrafficRuleImplement();
		horn.NoHorn();
 		
		VehicleParts vp=new IndianTrafficRuleImplement();
		vp.BreakLights();
		vp.rareWindow();
		vp.sideMirrors();
	}

	public void NoHorn()
	{
		System.out.println("No Horn only in India");
	}
	
	
	
	@Override
	public void RedLine() {
		System.out.println("Calling Redline");
	}

	@Override
	public void GreenLine() {
		System.out.println("Calling Greenline");
		
	}

	@Override
	public void YellowLine() {
		System.out.println("Calling Yellowline");
	}

	@Override
	public void zeebraCrossing() {
		System.out.println("Zeebra Crossing");
	}

	@Override
	public void rareWindow() {
		System.out.println("Rare window from Vehicle Parts");
		
	}

	@Override
	public void sideMirrors() {
		System.out.println("Side mirrors from Vehicle Parts");
		
	}

	@Override
	public void BreakLights() {
		System.out.println("break lights from Vehicle Parts");
		
	}

}
