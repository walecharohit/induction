import vpnconfiguration.*;

public class Main{

	public static void main(String [] args){
	
		int requestId = 1;
		VPN connection = new Gateway();
		long connectionKey = connection.generateRouteCode(requestId);
		System.out.println("The connection estabilished through Connection key: " + connectionKey);
	
		VPNBridge bridge = new BridgeRouting();
		VPN  vpn = new IntegrationAdapter(bridge);
		long bridgeKey = vpn.generateRouteCode(requestId);
		System.out.println("The connection estabilished through bridge Key: " + bridgeKey);
		
	}
}
