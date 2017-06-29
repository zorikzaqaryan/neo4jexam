package jumpmicro.shared;

import jumpmicro.shared.config.Neo4jConfig;
import jumpmicro.shared.dao.model.MMLDataDictionaryItem;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.neo4j.ogm.transaction.Transaction;

/**
 * Entry point to run application
 */
public class MainClass {
	public static void main(String[] args) {
		//get neo4j session factory
		SessionFactory sessionFactory = Neo4jConfig.getSessionFactory();



		final Session session = sessionFactory.openSession();
		try(Transaction tx = session.beginTransaction()){
			session.save(createEntityObject());
			tx.commit();
		}



	}

	/**
	 * In future use convertor toi convert dto to entity
	 *
	 * @return MMLDataDictionaryItem
	 */
	private static MMLDataDictionaryItem createEntityObject() {
		MMLDataDictionaryItem item = new MMLDataDictionaryItem();
		item.setId(2L);
		item.setDatabase("Some database");
		item.setVersion(2L);
		item.setDataDictionaryCode("Some code");
		return item;
	}

}
