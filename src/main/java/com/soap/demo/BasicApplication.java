package com.soap.demo;

import com.soap.demo.qlcb.model.ResultDmDonVi;
import com.soap.demo.qlcb.repository.DmDonViRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;

import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
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

	@Autowired
	DmDonViRepository dmDonViRepository;

	@Override
	public void run(String... args) throws Exception {
//		List<DmDonViEntity>dv=ServiceSumary.getDmDonViPage(2);
//		System.out.println("Auth item"+ dv.get(1).getDmTinhThanh().getTenTinhThanh());
//		List<ResultDmDonVi>t=dmDonViRepository.getDmDonVi();
		List<ResultDmDonVi>t=dmDonViRepository.getDmDonViPage(new PageRequest(2,50)).getContent();

		System.out.println(t.size());
		exit(0);
	}

}
