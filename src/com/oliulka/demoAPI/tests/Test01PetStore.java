package com.oliulka.demoAPI.tests;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.oliulka.demoAPI.flows.Flow01PetStore;

public class Test01PetStore {
	
	@Test(enabled=true)
	public void TestBasicAPI() throws Exception  
	{		
		/* ----------------------- start: Asserting Participant Data in API ----------------------------------------------*/
		TestGetPetStoreAPI();
		/* ----------------------- end: Asserting Participant Data in API -------------------------------------------**---*/
	}

	 public void TestGetPetStoreAPI()
	 {
		Flow01PetStore flow01 = new Flow01PetStore();
		JSONArray resp = flow01.TestGetParticipantAPI();
		flow01.AssertParticipantAPI(resp);
		System.out.println("Participant API data was asserted successfully");
	 }
}
