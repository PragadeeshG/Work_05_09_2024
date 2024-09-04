package com.test1;

public class TLSHandshakeDataAddressModel {
	private Integer secureSockerCipherFileName;
	private String clientHello;
	private String serverHello;
	private String keyExchange;
	private String authentication;
	private String sessionKeyGeneration;
	private String keyExchangeAlogorithm;
	private String bulkEncryptionAlgorithm;
	private String proxyBalancer;
	private String proxyPassMatch;
	private String proxyPass;
	private String proxyPassReverse;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public TLSHandshakeDataAddressModel() {

	}

	public TLSHandshakeDataAddressModel(Integer secureSockerCipherFileName, String clientHello, String serverHello,
			String keyExchange, String authentication, String sessionKeyGeneration, String keyExchangeAlogorithm,
			String bulkEncryptionAlgorithm, String proxyBalancer, String proxyPassMatch, String proxyPass,
			String proxyPassReverse, String creationDate, String modifiedDate, String entityState) {
		super();
		this.secureSockerCipherFileName = secureSockerCipherFileName;
		this.clientHello = clientHello;
		this.serverHello = serverHello;
		this.keyExchange = keyExchange;
		this.authentication = authentication;
		this.sessionKeyGeneration = sessionKeyGeneration;
		this.keyExchangeAlogorithm = keyExchangeAlogorithm;
		this.bulkEncryptionAlgorithm = bulkEncryptionAlgorithm;
		this.proxyBalancer = proxyBalancer;
		this.proxyPassMatch = proxyPassMatch;
		this.proxyPass = proxyPass;
		this.proxyPassReverse = proxyPassReverse;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSecureSockerCipherFileName() {
		return secureSockerCipherFileName;
	}

	public void setSecureSockerCipherFileName(Integer secureSockerCipherFileName) {
		this.secureSockerCipherFileName = secureSockerCipherFileName;
	}

	public String getClientHello() {
		return clientHello;
	}

	public void setClientHello(String clientHello) {
		this.clientHello = clientHello;
	}

	public String getServerHello() {
		return serverHello;
	}

	public void setServerHello(String serverHello) {
		this.serverHello = serverHello;
	}

	public String getKeyExchange() {
		return keyExchange;
	}

	public void setKeyExchange(String keyExchange) {
		this.keyExchange = keyExchange;
	}

	public String getAuthentication() {
		return authentication;
	}

	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}

	public String getSessionKeyGeneration() {
		return sessionKeyGeneration;
	}

	public void setSessionKeyGeneration(String sessionKeyGeneration) {
		this.sessionKeyGeneration = sessionKeyGeneration;
	}

	public String getKeyExchangeAlogorithm() {
		return keyExchangeAlogorithm;
	}

	public void setKeyExchangeAlogorithm(String keyExchangeAlogorithm) {
		this.keyExchangeAlogorithm = keyExchangeAlogorithm;
	}

	public String getBulkEncryptionAlgorithm() {
		return bulkEncryptionAlgorithm;
	}

	public void setBulkEncryptionAlgorithm(String bulkEncryptionAlgorithm) {
		this.bulkEncryptionAlgorithm = bulkEncryptionAlgorithm;
	}

	public String getProxyBalancer() {
		return proxyBalancer;
	}

	public void setProxyBalancer(String proxyBalancer) {
		this.proxyBalancer = proxyBalancer;
	}

	public String getProxyPassMatch() {
		return proxyPassMatch;
	}

	public void setProxyPassMatch(String proxyPassMatch) {
		this.proxyPassMatch = proxyPassMatch;
	}

	public String getProxyPass() {
		return proxyPass;
	}

	public void setProxyPass(String proxyPass) {
		this.proxyPass = proxyPass;
	}

	public String getProxyPassReverse() {
		return proxyPassReverse;
	}

	public void setProxyPassReverse(String proxyPassReverse) {
		this.proxyPassReverse = proxyPassReverse;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
