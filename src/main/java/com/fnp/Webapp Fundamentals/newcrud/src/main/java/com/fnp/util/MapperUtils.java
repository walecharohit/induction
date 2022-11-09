package com.fnp.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class MapperUtils.
 */
public class MapperUtils {

	/** The mapper. */
	private static ObjectMapper mapper;
	
	/**
	 * Instantiates a new mapper utils.
	 */
	private MapperUtils() {
		
	}
	
	/**
	 * Gets the mapper object.
	 *
	 * @return the mapper object
	 */
	public static ObjectMapper getObjectMapper() {
		if(mapper==null) {
			mapper = new ObjectMapper();
		}
		return mapper;
	}
}
