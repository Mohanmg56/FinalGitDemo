package Programs;

public class ChildEmirate extends ParentAirlines{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirate p=new ChildEmirate();
		p.BodyColour();
		p.engin();
		p.SafteyGuideLines();
	}

	@Override
	public void BodyColour() {
		System.out.println("Implimentd Body Colour");
		
	}

}
