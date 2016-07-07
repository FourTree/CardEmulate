package com.example.android.cardemulation;

public class SEApplet {

	private static byte[] SE_ID= null;
	
	public static byte[] getSEID(){
		if(SE_ID == null){
			return null;
		}else{
			return SE_ID;
		}
	}
	public static boolean setSEID(byte[] pseid){
		if(SE_ID == null){
			SE_ID = new byte[pseid.length];
			System.arraycopy(pseid, 0, SE_ID, 0, SE_ID.length);
			return true;
		}else
			return false;

	}
}
