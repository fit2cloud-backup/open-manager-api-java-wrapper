package com.fit2cloud.ome;

import org.apache.commons.codec.binary.Base64;

public class DsmAPIClient {
	
	
	public static void main(String[] args) {
		System.out.println(">>>>>>>>>>>>>>>>>开始登录dsmAPI");
		String loginURL="https://172.16.100.166:3033/api/rest/ApiConnection/Login";
		RestClientJson client = new RestClientJson(loginURL);
		client.addBasicAuthentication(Base64.encodeBase64String(new String("dsm").getBytes()), Base64.encodeBase64String(new String("DSM*201718").getBytes()));
		client.addHeader("x-dell-api-version", "2.0");
		client.addHeader("Content-Type", "application/json;charset=utf-8");
		client.addHeader("Accept", "application/json");
		try {
			client.execute(RestClientJson.RequestMethod.POST);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String tokencookie=client.getCookie();
		System.out.println(">>>>>>>>>>>>>>>>>>登录后获取的cookie："+tokencookie);
		
		System.out.println(">>>>>>>>>>>>>>>>>>开始获取存储列表");
		String storageURL="https://172.16.100.166:3033/api/rest/ApiConnection/ApiConnection/0/StorageCenterList";
		RestClientJson client2 =new RestClientJson(storageURL);
		client2.addHeader("Cookie", tokencookie);
		client2.addHeader("x-dell-api-version", "2.0");
		client2.addHeader("Content-Type", "application/json;charset=utf-8");
		client2.addHeader("Accept", "application/json");
		client2.addParam("verify", "False");
		
		try {
			client2.execute(RestClientJson.RequestMethod.GET);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String strogeJsonData=client2.getResponse();
		System.out.println(">>>>>>>>>>>>>>>>>>获取的存储设备信息："+strogeJsonData);
		
		
	}

}
