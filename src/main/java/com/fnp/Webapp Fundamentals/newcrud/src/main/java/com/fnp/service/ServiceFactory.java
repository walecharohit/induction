package com.fnp.service;

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
