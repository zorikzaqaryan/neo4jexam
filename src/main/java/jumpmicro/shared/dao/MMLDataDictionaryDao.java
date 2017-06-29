package jumpmicro.shared.dao;

import jumpmicro.shared.model.MMLDataDictionaryItemDto;

/**
 * Created by zorikz on 06/28/2017.
 */
public interface MMLDataDictionaryDao {
	void addMMLDataDictionaryDaoImpl(MMLDataDictionaryItemDto dto);

	MMLDataDictionaryItemDto getMMLDataDictionaryDaoImpl(MMLDataDictionaryItemDto dto);
}
