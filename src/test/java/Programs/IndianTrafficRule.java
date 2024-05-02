package Programs;

import org.testng.annotations.Test;

public class IndianTrafficRule implements CentralPublicTraffic,ContinentalTraffic{

	public static void main(String[] args) {
		
		CentralPublicTraffic a= new IndianTrafficRule();
		ContinentalTraffic a2= new IndianTrafficRule();
		IndianTrafficRule a1= new IndianTrafficRule();
		a.FlashYello();
		a.greenGo();
		a.RefStop();
		a1.walk();
		a2.TrainSymbole();
	}

	
	public void greenGo() {
		System.out.println("green");
		
	}

	
	public void RefStop() {
		System.out.println("Red");
		
	}

	public void FlashYello() {
	System.out.println("FlashYello");
		
	}
	
	public void walk()
	{
		System.out.println("walk");
	}


	@Override
	public void TrainSymbole() {
		System.out.println("TrainWalk");
		
	}



}
