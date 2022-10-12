package vpnconfiguration;

import java.lang.Math;

public class Gateway implements VPN{
	long code;
	public long generateRouteCode(int requestId){
		
		double r = Math.random();
		code = requestId * (int)(r * 10);
		return code;
	}
}
