package com.soap.qlcb;

import com.soap.qlcb.endpoint.controller.entity.DmDonViEntityResult;
import com.soap.qlcb.endpoint.controller.entity.DmTinhThanh;
import com.soap.qlcb.endpoint.controller.repository.DmDonViRepository;
import com.soap.qlcb.endpoint.controller.repository.DmTinhThanhRepository;
import com.soap.qlcb.endpoint.controller.results.ResultDmDonVi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QlcbApplicationTests {

	@Autowired
	DmDonViRepository dmDonViRepository;
	@Autowired
	DmTinhThanhRepository dmTinhThanhRepository;
	@Test
	public void contextLoads() {
//			List<Object> list= dmDonViRepository.getDmDonViByNativeQuery();
//
//			System.out.println(list.size());

//		rs = (ResultSet) callableStatement.getObject("p_recordset");
//		try {
//			System.out.println(String.valueOf(rs.getString("ID")));
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		List<DmTinhThanh> list=dmTinhThanhRepository.getDmTinhThanhProc();
		System.out.println(list.size());
		System.out.println(list.get(0).toString());
		List<ResultDmDonVi> list1=dmDonViRepository.getDmDonViByProc();
		System.out.println(list1.size());
		System.out.println(list1.get(15).toString());
//		System.out.println(list.get(0).toString());
//		System.out.println(dmTinhThanhRepository.getProcedure(5));
//		DmDonViEntityResult re= (DmDonViEntityResult) list.get(1);
//
//		System.out.println(re.toString());
	}

}
