package com.soap.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;
import java.io.IOException;
import java.io.InputStream;

import java.util.Hashtable;
import java.util.Properties;



@SpringBootApplication
public class BasicApplication implements CommandLineRunner {
	static Logger log = LogManager.getLogger(BasicApplication.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);

		Properties prop = new Properties();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		InputStream input = classLoader.getResourceAsStream("config/config.properties");
		try {
			prop.load(input);
		} catch (IOException e) {
//            e.printStackTrace();
		}

		Object implementedGet = new SoapBasicMain();

		Endpoint eCategoriesCrud = Endpoint.create(SOAPBinding.SOAP11HTTP_BINDING, implementedGet);

		if (prop.getProperty("CategoriesGetPort") != null) {
			String categoriesGetData = prop.getProperty("webprotocol")
					+ "://" + prop.getProperty("hostname")
					+ ":" + prop.getProperty("CategoriesGetPort")
					+ "/" + prop.getProperty("CategoriesGetPath");
			System.out.println(categoriesGetData + "?wsdl");
			eCategoriesCrud.publish(categoriesGetData);
		}
		log.info("Runnn");
	}

//	@Autowired
//	DmDonViRepository dmDonViRepository;


	@Override
	public void run(String... args) throws Exception {
//		List<DmDonViEntity>dv=ServiceSumary.getDmDonViPage(2);
//		System.out.println("Auth item"+ dv.get(1).getDmTinhThanh().getTenTinhThanh());
//		List<ResultDmDonVi>t=dmDonViRepository.getDmDonViQlcb();

//		Page<ResultDmDonVi>k=dmDonViRepository.getDmDonViPage(PageRequest.of(2,50, Sort.Direction.ASC,"id"));
//		System.out.println(k.getTotalPages());
//		System.out.println(k.getTotalElements());
//		System.out.println(k.getPageable().getPageNumber());
//		List<ResultDmDonVi>t=k.getContent();
//		List<ResultCbCanBo> t= ServiceCrudDanhMuc.getResultCbCanBoQlcb();
//		System.out.println(t.size());
//		System.out.println(t.get(2).toString());
//		ServiceSumary.deleteDmPhongBanById(1262);
//		ServiceSumary.addDmTinhThanh();
//		System.out.println();

//		exit(0);
//		DirContext t= checkBindLdap("cn=adminLdap","Oracle_123456a#");
//		String baseDN = "dc=angiang,dc=dbhc,dc=bhxh,dc=vn";
////		String filter = "(&(objectClass="
////				+ "user-bhxh"
////				+ ")(" + "user-bhxh-email" + "=" + "anhdn@vss.gov.vn" + "))";
//		String filter="(objectClass=*)";
//
//		SearchControls searchCon = new SearchControls();
//		searchCon.setSearchScope(SearchControls.ONELEVEL_SCOPE);
//		searchCon.setReturningAttributes(new String[]{
//				"dn"
//		});
//		NamingEnumeration results;
//		results = t.search(baseDN, filter,searchCon);
//		if (results != null) {
//			while (results.hasMore()) {
//				javax.naming.directory.SearchResult res = (javax.naming.directory.SearchResult) results.next();
//				Attributes attr = res.getAttributes();
//				System.out.println(res.getNameInNamespace());
//				if (attr.get("dn") != null) {
//					System.out.println(attr.get("dn").get());
//				}
//			}
//		}
//		if(t!=null){
//			System.out.println("not null");
//			t.close();
//		}
	}

	private static Hashtable<String, String> ldapContext(Hashtable<String, String> env) throws Exception {
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://ldap-qltb.bhxh.vn:5389");
		env.put(Context.REFERRAL, "ignore");
		return env;
	}
	private DirContext checkBindLdap(String dn, String password) throws Exception {

		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put("com.sun.jndi.ldap.read.timeout", "120000");
		env.put(Context.SECURITY_PRINCIPAL, dn);
		env.put(Context.SECURITY_CREDENTIALS, password);
		return new InitialDirContext(ldapContext(env));

	}
}
