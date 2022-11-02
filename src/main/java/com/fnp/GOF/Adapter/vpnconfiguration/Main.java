import vpnconfiguration.*;

public class Main{

	public static void main(String [] args){
	
		int requestId = 1;
		VPN connection = new Gateway();
		long connectionKey = connection.generateRouteCode(requestId);
		System.out.println(connectionKey);
	
		VPNBridge bridge = new BridgeRouting();
		VPN  vpn = new IntegrationAdapter(bridge);
		long bridgeKey = vpn.generateRouteCode(requestId);
		System.out.println(bridgeKey);
		
	}
}
