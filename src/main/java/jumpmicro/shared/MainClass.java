package jumpmicro.shared;

import jumpmicro.shared.config.Neo4jConfig;
import jumpmicro.shared.dao.MMLDataDictionaryDao;
import jumpmicro.shared.dao.impl.MMLDataDictionaryDaoImpl;
import jumpmicro.shared.dao.model.MMLDataDictionaryItem;
import jumpmicro.shared.model.MMLDataDictionaryItemDto;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.neo4j.ogm.transaction.Transaction;

/**
 * Entry point to run application
 */
public class MainClass {
	public static void main(String[] args) {
		//get neo4j session factory
		final SessionFactory sessionFactory = Neo4jConfig.getSessionFactory();
		//use MMLDataDictionaryDao to save object
		MMLDataDictionaryDao dataDictionaryDao = new MMLDataDictionaryDaoImpl(sessionFactory);
		dataDictionaryDao.addMMLDataDictionaryDaoImpl(createEntityObject());
	}


	/**
	 * create dummy data
	 *
	 * @return MMLDataDictionaryItem
	 */
	private static MMLDataDictionaryItemDto createEntityObject() {
		MMLDataDictionaryItemDto item = new MMLDataDictionaryItemDto();
		item.setId(2L);
		item.setDatabase("Some database");
		item.setVersion(2L);
		item.setDataDictionaryCode("Some code");
		return item;
	}
}
