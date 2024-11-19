package com.tka.eci.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.eci.dao.Dao;
import com.tka.eci.entity.Candidate;

public class Service {

	Dao dao = null;

	public List<Candidate> getAllCandidates() {
		dao = new Dao();
		List<Candidate> allCandidates = dao.getAllCandidates();

		return allCandidates;

	}

	public List<Candidate> getAllIndependentCandidates() {
		List<Candidate> allIndcandidates = new ArrayList<Candidate>();

		dao = new Dao();

		List<Candidate> allCandidates = dao.getAllCandidates();

		for (Candidate candidate : allCandidates) {
			if (candidate.getPartyname().equals("Independent")) {
				allIndcandidates.add(candidate);
			}
		}
		return allIndcandidates;

	}

	public List<Candidate> getAllNCPCandidates() {

		List<Candidate> allncpcandidates = new ArrayList<Candidate>();

		dao = new Dao();
		List<Candidate> allCandidates = dao.getAllCandidates();

		for (Candidate candidate : allCandidates) {
			if (candidate.getPartyname().equals("NCP SP")) {
				allncpcandidates.add(candidate);
			}

		}
		return allncpcandidates;
	}

	public List<Candidate> getAllBJPCandidates() {
		List<Candidate> allbjpcandidates = new ArrayList<Candidate>();

		dao = new Dao();

		List<Candidate> allCandidates = dao.getAllCandidates();

		for (Candidate candidate : allCandidates) {
			if (candidate.getPartyname().equals("BJP")) {
				allbjpcandidates.add(candidate);
			}
		}

		return allbjpcandidates;
	}

	public List<Candidate> getAllFemaleCandidates() {
		List<Candidate>allfemalecandidates=new ArrayList<Candidate>();
		
		dao=new Dao();
		List<Candidate> allCandidates = dao.getAllCandidates();
		
		for (Candidate candidate : allCandidates) {
			if(candidate.getGender().equals("Female")) {
				allfemalecandidates.add(candidate);
			}
			
		}
		
		return allfemalecandidates;
		
		
	}

}
