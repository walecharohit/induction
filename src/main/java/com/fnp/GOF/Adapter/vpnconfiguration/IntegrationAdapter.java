package vpnconfiguration;

public class IntegrationAdapter implements VPN{
	
	VPNBridge vpnbridge;
		public IntegrationAdapter(VPNBridge vpnbridge){
			this.vpnbridge = vpnbridge;
		}
		
		public long generateRouteCode(int requestId){
			long code = vpnbridge.assignRouteId(requestId);
		 	return code;
		}
}

