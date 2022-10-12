package vpnconfiguration;

public class BridgeRouting implements VPNBridge{
	long code;
	public long assignRouteId(int requestId){
		String routeList[] = {"uk","germany","france"};
		code = requestId + 1;
		return code;
	}
}
