package jumpmicro.shared.dao.model.converter;

import jumpmicro.shared.dao.model.MMLDataDictionaryItem;
import jumpmicro.shared.model.MMLDataDictionaryItemDto;

/**
 * Simple class to convert dto to entity and via versa
 * In future can be used some converter libs for example selma
 */
public class MMLDataDictionaryItemConverter {
	public static MMLDataDictionaryItemDto toDto(MMLDataDictionaryItem in) {
		MMLDataDictionaryItemDto dto = new MMLDataDictionaryItemDto();
		dto.setId(in.getId());
		dto.setVersion(in.getVersion());
		dto.setDatabase(in.getDatabase());
		dto.setDataDictionaryCode(in.getDataDictionaryCode());
		dto.setDataDictionaryGroupId(in.getDataDictionaryGroupId());
		dto.setDataDictionaryValue(in.getDataDictionaryValue());
		dto.setGuidIdentifier(in.getGuidIdentifier());
		return dto;
	}

	public static MMLDataDictionaryItem toEntity(MMLDataDictionaryItemDto in) {
		MMLDataDictionaryItem entity = new MMLDataDictionaryItem();
		entity.setId(in.getId());
		entity.setVersion(in.getVersion());
		entity.setDatabase(in.getDatabase());
		entity.setDataDictionaryCode(in.getDataDictionaryCode());
		entity.setDataDictionaryGroupId(in.getDataDictionaryGroupId());
		entity.setDataDictionaryValue(in.getDataDictionaryValue());
		entity.setGuidIdentifier(in.getGuidIdentifier());
		return entity;
	}
}
