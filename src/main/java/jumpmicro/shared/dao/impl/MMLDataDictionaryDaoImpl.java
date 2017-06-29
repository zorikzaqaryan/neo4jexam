package jumpmicro.shared.dao.impl;

import org.neo4j.ogm.session.SessionFactory;

/**
 * Implementation of MMLDataDictionary dao
 */
public class MMLDataDictionaryDaoImpl {
	private SessionFactory sessionFactory;

	private MMLDataDictionaryDaoImpl() {
	}

	public MMLDataDictionaryDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
