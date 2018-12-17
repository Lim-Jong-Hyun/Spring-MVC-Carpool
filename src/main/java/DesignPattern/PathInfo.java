﻿package DesignPattern;

public class PathInfo {
	
	private static PathInfo pi = new PathInfo();
	
//	 프로필 사진 저장 경로 : path + profile

//	김재민
	private String path = "C:\\Users\\panwo\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\webapps\\";
	
//	임종현
//	private String path = "C:\\Users\\KITRI\\Desktop\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp2\\webapps\\";

	
	public PathInfo() {
		
	}
	
	public static PathInfo getInstance() {
		if(pi == null) {
			pi = new PathInfo();
		}
		return pi;
	}
	
	public String getPath() {
		return path;
	}
}