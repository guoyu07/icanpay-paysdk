package com.icanpay.utils;

public class ICanPayConfig {

	/**
	 * HTTP(S) 连接超时时间，单位毫秒
	 *
	 * @return
	 */
	public static int getHttpConnectTimeoutMs() {
		return 6 * 1000;
	}

	/**
	 * HTTP(S) 读数据超时时间，单位毫秒
	 *
	 * @return
	 */
	public static int getHttpReadTimeoutMs() {
		return 8 * 1000;
	}

}
