package jumpmicro.shared.model;

/**
 * Javabean class
 */
public class MMLDataDictionaryItemDto {
	private Long id;
	private String guidIdentifier;
	private Long version;
	private String dataDictionaryGroupId;
	private String dataDictionaryCode;
	private String dataDictionaryValue;
	private String database;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGuidIdentifier() {
		return guidIdentifier;
	}

	public void setGuidIdentifier(String guidIdentifier) {
		this.guidIdentifier = guidIdentifier;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getDataDictionaryGroupId() {
		return dataDictionaryGroupId;
	}

	public void setDataDictionaryGroupId(String dataDictionaryGroupId) {
		this.dataDictionaryGroupId = dataDictionaryGroupId;
	}

	public String getDataDictionaryCode() {
		return dataDictionaryCode;
	}

	public void setDataDictionaryCode(String dataDictionaryCode) {
		this.dataDictionaryCode = dataDictionaryCode;
	}

	public String getDataDictionaryValue() {
		return dataDictionaryValue;
	}

	public void setDataDictionaryValue(String dataDictionaryValue) {
		this.dataDictionaryValue = dataDictionaryValue;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}
}
