package jumpmicro.shared.dao.impl;

import jumpmicro.shared.dao.MMLDataDictionaryDao;
import jumpmicro.shared.dao.model.converter.MMLDataDictionaryItemConverter;
import jumpmicro.shared.model.MMLDataDictionaryItemDto;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.neo4j.ogm.transaction.Transaction;

/**
 * Implementation of MMLDataDictionary dao
 */
public class MMLDataDictionaryDaoImpl implements MMLDataDictionaryDao {
	private SessionFactory sessionFactory;

	private MMLDataDictionaryDaoImpl() {
	}

	public MMLDataDictionaryDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addMMLDataDictionaryDaoImpl(MMLDataDictionaryItemDto dto) {
//get session
		final Session session = sessionFactory.openSession();
//save entity
		try (Transaction tx = session.beginTransaction()) {
			session.save(MMLDataDictionaryItemConverter.toEntity(dto));
			tx.commit();
		}
	}

	@Override
	public MMLDataDictionaryItemDto getMMLDataDictionaryDaoImpl(MMLDataDictionaryItemDto dto) {
		//implement get
		return null;
	}
}
