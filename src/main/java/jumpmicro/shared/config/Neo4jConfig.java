package jumpmicro.shared.config;

import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.SessionFactory;

/**
 * Configuration class for neo4j
 */
public class Neo4jConfig {
	private static final Configuration config = new Configuration();

	private Neo4jConfig() {
	}

	/**
	 * method connect via http driver to neo4j
	 *
	 * @return Connection for neo4j
	 */
	private static Configuration configure() {
		config.driverConfiguration()
				.setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver")
				.setURI("http://localhost:7474");
		return config;
	}

	/**
	 * Give connection and neo4j ogm model folder
	 */
	public static SessionFactory getSessionFactory() {
		return new SessionFactory(configure(), "jumpmicro.shared.dao.model");
	}

}
