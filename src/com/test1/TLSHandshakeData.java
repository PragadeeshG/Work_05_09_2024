package com.test1;

public class TLSHandshakeData {
	private Integer secureSockerCipherFileName;
	private Integer secureSockerCipherPassword;
	private String serverRoot;
	private Integer serverInter;
	private String tlsLayers;
	private String sslRecordProtocol;
	private String handshakeProtocol;
	private String changeCipherSpec;
	private String alertProtocol;
	private String vaidity;
	private String remarks;

	public TLSHandshakeData() {

	}

	public TLSHandshakeData(Integer secureSockerCipherFileName, Integer secureSockerCipherPassword, String serverRoot,
			Integer serverInter, String tlsLayers, String sslRecordProtocol, String handshakeProtocol,
			String changeCipherSpec, String alertProtocol, String vaidity, String remarks) {
		super();
		this.secureSockerCipherFileName = secureSockerCipherFileName;
		this.secureSockerCipherPassword = secureSockerCipherPassword;
		this.serverRoot = serverRoot;
		this.serverInter = serverInter;
		this.tlsLayers = tlsLayers;
		this.sslRecordProtocol = sslRecordProtocol;
		this.handshakeProtocol = handshakeProtocol;
		this.changeCipherSpec = changeCipherSpec;
		this.alertProtocol = alertProtocol;
		this.vaidity = vaidity;
		this.remarks = remarks;
	}

	public Integer getSecureSockerCipherFileName() {
		return secureSockerCipherFileName;
	}

	public void setSecureSockerCipherFileName(Integer secureSockerCipherFileName) {
		this.secureSockerCipherFileName = secureSockerCipherFileName;
	}

	public Integer getSecureSockerCipherPassword() {
		return secureSockerCipherPassword;
	}

	public void setSecureSockerCipherPassword(Integer secureSockerCipherPassword) {
		this.secureSockerCipherPassword = secureSockerCipherPassword;
	}

	public String getServerRoot() {
		return serverRoot;
	}

	public void setServerRoot(String serverRoot) {
		this.serverRoot = serverRoot;
	}

	public Integer getServerInter() {
		return serverInter;
	}

	public void setServerInter(Integer serverInter) {
		this.serverInter = serverInter;
	}

	public String getTlsLayers() {
		return tlsLayers;
	}

	public void setTlsLayers(String tlsLayers) {
		this.tlsLayers = tlsLayers;
	}

	public String getSslRecordProtocol() {
		return sslRecordProtocol;
	}

	public void setSslRecordProtocol(String sslRecordProtocol) {
		this.sslRecordProtocol = sslRecordProtocol;
	}

	public String getHandshakeProtocol() {
		return handshakeProtocol;
	}

	public void setHandshakeProtocol(String handshakeProtocol) {
		this.handshakeProtocol = handshakeProtocol;
	}

	public String getChangeCipherSpec() {
		return changeCipherSpec;
	}

	public void setChangeCipherSpec(String changeCipherSpec) {
		this.changeCipherSpec = changeCipherSpec;
	}

	public String getAlertProtocol() {
		return alertProtocol;
	}

	public void setAlertProtocol(String alertProtocol) {
		this.alertProtocol = alertProtocol;
	}

	public String getVaidity() {
		return vaidity;
	}

	public void setVaidity(String vaidity) {
		this.vaidity = vaidity;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
