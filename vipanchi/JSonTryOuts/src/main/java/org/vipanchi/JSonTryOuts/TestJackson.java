/**
 * 
 */
package org.vipanchi.JSonTryOuts;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author PavanSingaraju
 *
 */
public class TestJackson {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
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
		
		Map<String, Object> checkData = new HashMap<String, Object> ();
		checkData = om.readValue(jSonData.getBytes(), new TypeReference<Map<String, Object>>(){});
		
		System.out.println(jSonData);
		System.out.println(checkData);
		
		if(checkData.equals(userData)) System.out.println("True");
		else System.out.println("False");
	}

}
