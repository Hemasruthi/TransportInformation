package org.Transport;
import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	
	public void transportForm()
	{
		System.out.println("transportform");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Transport t=new Transport();
          Air a= new Air();
          Road r=new Road();
          Water w=new Water();
          t.transportForm();
          a.aeroPlane();
          a.helicopter();
          r.bike();r.bus();r.car();r.cycle();
          w.boat();
          w.ship();
	}

}
