package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Report;
import com.example.repo.ReportRepository;


@Service
public class ReportService {

	ReportRepository repo;
	
	public List<Report> getReport(){
		return repo.findAll();
	}
}
