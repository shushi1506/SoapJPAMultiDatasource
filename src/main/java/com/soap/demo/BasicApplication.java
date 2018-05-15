package com.soap.demo;

import com.soap.demo.endpoint.core.crud.ServiceCrudQlcb;
import com.soap.demo.endpoint.core.crud.ServiceCrudQltb;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static java.lang.System.exit;

@SpringBootApplication
public class BasicApplication implements CommandLineRunner {
	static Logger log = Logger.getLogger(BasicApplication.class.getName());
//	@Autowired
//	ServiceCrudQlcb serviceCrudQlcb;
//	@Autowired
//	ServiceCrudQltb serviceCrudQltb;

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




	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Dm Quoc Gia:"+serviceCrudQlcb.getAllDmQuocGia().size());
//		System.out.println("Dm Tinh Thanh:"+serviceCrudQlcb.getAllDmTinhThanh().size());
//		System.out.println("Auth item"+serviceCrudQltb.getAllAuthItem().size());
//		exit(0);
	}

}
