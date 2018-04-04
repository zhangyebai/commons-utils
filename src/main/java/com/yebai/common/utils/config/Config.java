package com.yebai.common.utils.config;

/****************************************************
 * @author Zhang Yebai
 * @description 
 * @date 2018/4/4 16:11
 ****************************************************/
public class Config {
	private Config(){}
	
	public static final class Resp{
		private Resp(){}
		public static final Integer SUCCESS_CODE = 200;
		public static final Integer ERROR_CODE = 500;
	
		public static final String SUCCESS_MESSAGE = "success";
		public static final String ERROR_MESSAGE = "error";
	}
	
	public static final class Time{
		private Time(){}
		public static final String DATE_TIME_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";
		public static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd";
		public static final String TIME_FORMAT_PATTERN = "HH:mm:ss";
	}
	
	public static final class ExceptionMessage{
		private ExceptionMessage(){}
		
		public static final String ILLEGAL_ARGUMENT_MESSAGE = "parameter is illegal for this request. ";
		public static final String RUNTIME_EXCEPTION_MESSAGE = "unknown runtime exception happens in this request. ";
	}
}