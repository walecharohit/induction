package com.fnp.factory;

import com.fnp.service.DeleteService;
import com.fnp.service.DisplayService;
import com.fnp.service.InsertService;
import com.fnp.service.SearchService;
import com.fnp.service.ServiceInterface;
import com.fnp.service.UpdateService;

public class ServiceFactory {

	public ServiceInterface serviceSelector(String serviceType) {
		
		if(serviceType == "display") {
			return new DisplayService();
		}else if(serviceType == "search") {
			return new SearchService();
		}else if (serviceType == "insert") {
			return new InsertService();
		}else if (serviceType == "update") {
			return new UpdateService();
		} else if (serviceType == "delete") {
			return new DeleteService();
		}else {
			return null;
		}
	}
	}
