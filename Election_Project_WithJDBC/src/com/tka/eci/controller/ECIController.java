package com.tka.eci.controller;

import java.util.ArrayList;
import java.util.List;

import com.tka.eci.dao.Dao;
import com.tka.eci.entity.Candidate;
import com.tka.eci.service.Service;

public class ECIController {

	Service service = null;

	public List<Candidate> getAllCandidates() {

		service = new Service();

		List<Candidate> allCandidates = service.getAllCandidates();

		return allCandidates;

	}

	public List<Candidate> getAllIndependentCandidates() {

		service = new Service();

		List<Candidate> allIndcandidates = service.getAllIndependentCandidates();

		return allIndcandidates;

	}

	public List<Candidate> getAllNCPCandidates() {
		service = new Service();

		List<Candidate> allncpcandidates = service.getAllNCPCandidates();

		return allncpcandidates;
	}

	public List<Candidate> getAllBJPCandidates() {

		service = new Service();
		List<Candidate> allbjpcandidates = service.getAllBJPCandidates();

		return allbjpcandidates;
	}

	public List<Candidate>getAllFemaleCandidates() {
		
		service=new Service();
		List<Candidate>allfemalecandidates=service.getAllFemaleCandidates();
		
		return allfemalecandidates;
		
		
	}

}
