package com.test1;

public class TLSHandshakeDataInfoModel {
	private Integer secureSockerCipherFileName;
	private String sourcePort;
	private String destinationPort;
	private String secureSockerCipherStatus;
	private String ackLength;
	private String headerLength;
	private String controlEngine;
	private String controlFlags;
	private String sslProxyCheckPeerCN;
	private String sslProxyCheckPeerName;
	private String windowSize;
	private String checkSum;
	private String urgentPointers;

	public TLSHandshakeDataInfoModel() {

	}

	public TLSHandshakeDataInfoModel(Integer secureSockerCipherFileName, String sourcePort, String destinationPort,
			String secureSockerCipherStatus, String ackLength, String headerLength, String controlEngine,
			String controlFlags, String sslProxyCheckPeerCN, String sslProxyCheckPeerName, String windowSize,
			String checkSum, String urgentPointers) {
		super();
		this.secureSockerCipherFileName = secureSockerCipherFileName;
		this.sourcePort = sourcePort;
		this.destinationPort = destinationPort;
		this.secureSockerCipherStatus = secureSockerCipherStatus;
		this.ackLength = ackLength;
		this.headerLength = headerLength;
		this.controlEngine = controlEngine;
		this.controlFlags = controlFlags;
		this.sslProxyCheckPeerCN = sslProxyCheckPeerCN;
		this.sslProxyCheckPeerName = sslProxyCheckPeerName;
		this.windowSize = windowSize;
		this.checkSum = checkSum;
		this.urgentPointers = urgentPointers;
	}

	public Integer getSecureSockerCipherFileName() {
		return secureSockerCipherFileName;
	}

	public void setSecureSockerCipherFileName(Integer secureSockerCipherFileName) {
		this.secureSockerCipherFileName = secureSockerCipherFileName;
	}

	public String getSourcePort() {
		return sourcePort;
	}

	public void setSourcePort(String sourcePort) {
		this.sourcePort = sourcePort;
	}

	public String getDestinationPort() {
		return destinationPort;
	}

	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
	}

	public String getSecureSockerCipherStatus() {
		return secureSockerCipherStatus;
	}

	public void setSecureSockerCipherStatus(String secureSockerCipherStatus) {
		this.secureSockerCipherStatus = secureSockerCipherStatus;
	}

	public String getAckLength() {
		return ackLength;
	}

	public void setAckLength(String ackLength) {
		this.ackLength = ackLength;
	}

	public String getHeaderLength() {
		return headerLength;
	}

	public void setHeaderLength(String headerLength) {
		this.headerLength = headerLength;
	}

	public String getControlEngine() {
		return controlEngine;
	}

	public void setControlEngine(String controlEngine) {
		this.controlEngine = controlEngine;
	}

	public String getControlFlags() {
		return controlFlags;
	}

	public void setControlFlags(String controlFlags) {
		this.controlFlags = controlFlags;
	}

	public String getSslProxyCheckPeerCN() {
		return sslProxyCheckPeerCN;
	}

	public void setSslProxyCheckPeerCN(String sslProxyCheckPeerCN) {
		this.sslProxyCheckPeerCN = sslProxyCheckPeerCN;
	}

	public String getSslProxyCheckPeerName() {
		return sslProxyCheckPeerName;
	}

	public void setSslProxyCheckPeerName(String sslProxyCheckPeerName) {
		this.sslProxyCheckPeerName = sslProxyCheckPeerName;
	}

	public String getWindowSize() {
		return windowSize;
	}

	public void setWindowSize(String windowSize) {
		this.windowSize = windowSize;
	}

	public String getCheckSum() {
		return checkSum;
	}

	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}

	public String getUrgentPointers() {
		return urgentPointers;
	}

	public void setUrgentPointers(String urgentPointers) {
		this.urgentPointers = urgentPointers;
	}

}
