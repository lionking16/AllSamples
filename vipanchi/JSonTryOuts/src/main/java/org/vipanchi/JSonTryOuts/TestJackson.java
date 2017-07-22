/**
 * 
 */
package org.vipanchi.JSonTryOuts;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author PavanSingaraju
 *
 */
public class TestJackson {

	/**
	 * @param args
	 * @throws JsonProcessingException 
	 */
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		ObjectMapper om = new ObjectMapper();
		Map<String,Object> userData = new HashMap<String,Object>();
		Map<String,String> nameStruct = new HashMap<String,String>();
		nameStruct.put("first", "Joe");
		nameStruct.put("last", "Sixpack");
		userData.put("name", nameStruct);
		userData.put("gender", "MALE");
		userData.put("verified", Boolean.FALSE);
		userData.put("userImage", "Rm9vYmFyIQ==");
		
		String jSonData = om.writeValueAsString(userData);
		
		System.out.println(jSonData);
	}

}
