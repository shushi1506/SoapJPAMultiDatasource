package com.soap.qlcb;

import com.soap.qlcb.endpoint.controller.repository.DmDonViRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class QlcbApplication {
	static Logger log = LogManager.getLogger(QlcbApplication.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(QlcbApplication.class, args);

		Properties prop = new Properties();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		InputStream input = classLoader.getResourceAsStream("config/config.properties");
		try {
			prop.load(input);
		} catch (IOException e) {
//            e.printStackTrace();
		}

		Object implementedGet = new SoapServiceQlcbMain();

		Endpoint eCategoriesCrud = Endpoint.create(SOAPBinding.SOAP11HTTP_BINDING, implementedGet);

		if (prop.getProperty("ApiQlcbPort") != null) {
			String categoriesGetData = prop.getProperty("webprotocol")
					+ "://" + prop.getProperty("hostname")
					+ ":" + prop.getProperty("ApiQlcbPort")
					+ "/" + prop.getProperty("ApiQlcbPath");
			System.out.println(categoriesGetData + "?wsdl");
			eCategoriesCrud.publish(categoriesGetData);
		}
		log.info("Qlcb run");
	}
}
