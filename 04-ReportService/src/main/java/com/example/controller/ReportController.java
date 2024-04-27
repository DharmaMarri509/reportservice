package com.example.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Report;
import com.example.service.ReportService;

@RestController
public class ReportController {
	

//	String url = "jdbc:mysql://localhost:3306/banking_app";
//	String user = "root";
//	String pswd = "Ramu@9988";
	
	
	ReportService service;
	
	@GetMapping("/getReport")
	public List<Report> getReport() {
//		List<Report> li = new ArrayList<>();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection(url, user, pswd);
//			String query = "select * from report";
//			PreparedStatement st = con.prepareStatement(query);
//			ResultSet rs = st.executeQuery();
//			while(rs.next()) {
//				//System.out.println(rs.getInt(1)+" -> "+rs.getString(2)+" -> "+rs.getString(3));
//				Report re = new Report();
//				re.setPid(rs.getInt(1));
//				re.setPname(rs.getString(2));
//				re.setStock(rs.getInt(3));
//				
//				li.add(re);
//			}
//			st.close();
//			con.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return service.getReport();
	}

}
