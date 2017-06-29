package jumpmicro.shared.dao.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.io.Serializable;

/**
 * Javabean class
 */
@NodeEntity
public class MMLDataDictionaryItem implements Serializable {
	@GraphId
	private Long id;
	@Property(name = "guidIdentifier")
	private String guidIdentifier;
	@Property(name = "version")
	private Long version;
	@Property(name = "dataDictionaryGroupId")
	private String dataDictionaryGroupId;
	@Property(name = "dataDictionaryCode")
	private String dataDictionaryCode;
	@Property(name = "dataDictionaryValue")
	private String dataDictionaryValue;
	@Property(name = "database")
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
