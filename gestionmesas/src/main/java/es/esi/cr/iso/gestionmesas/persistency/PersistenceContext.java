package es.esi.cr.iso.gestionmesas.persistency;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
class PersistenceContext {

	@Bean(destroyMethod = "close")
	DataSource dataSource(Environment env) {
		HikariConfig dataSourceConfig = new HikariConfig();
		dataSourceConfig.setDriverClassName(env.getRequiredProperty("spring.datasource.driver"));
		dataSourceConfig.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		dataSourceConfig.setUsername(env.getRequiredProperty("spring.datasource.username"));
		dataSourceConfig.setPassword(env.getRequiredProperty("spring.datasource.password"));

		return new HikariDataSource(dataSourceConfig);
	}

	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, Environment env) {
		LocalContainerEntityManagerFactoryBean entityManFacBean = new LocalContainerEntityManagerFactoryBean();
		entityManFacBean.setDataSource(dataSource);
		entityManFacBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		entityManFacBean.setPackagesToScan("es.esi.cr.iso.gestionmesas.model");

		Properties jpaProperties = new Properties();

		// Configures the used database dialect. This allows Hibernate to create SQL
		// that is optimized for the used database.
		jpaProperties.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));

		// Specifies the action that is invoked to the database when the Hibernate
		// SessionFactory is created or closed.
		jpaProperties.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));

		// Configures the naming strategy that is used when Hibernate creates new
		// database objects and schema elements
		jpaProperties.put("hibernate.ejb.naming_strategy", env.getRequiredProperty("hibernate.ejb.naming_strategy"));

		// If the value of this property is true, Hibernate writes all SQL
		// statements to the console.
		jpaProperties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));

		// If the value of this property is true, Hibernate will format the SQL
		// that is written to the console.
		jpaProperties.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
		
		jpaProperties.put("hibernate.enable_lazy_load_no_trans", env.getRequiredProperty("hibernate.enable_lazy_load_no_trans"));
		
		jpaProperties.put("hibernate.event.merge.entity_copy_observer", env.getRequiredProperty("hibernate.event.merge.entity_copy_observer"));

		entityManFacBean.setJpaProperties(jpaProperties);

		return entityManFacBean;
	}

	@Bean
	JpaTransactionManager transactionManager(EntityManagerFactory entityManFact) {
		JpaTransactionManager transManager = new JpaTransactionManager();
		transManager.setEntityManagerFactory(entityManFact);
		return transManager;
	}

	// Add the other beans here
}