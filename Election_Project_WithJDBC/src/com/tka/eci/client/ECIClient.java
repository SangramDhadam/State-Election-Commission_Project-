package com.tka.eci.client;

import java.util.List;

import com.tka.eci.controller.ECIController;
import com.tka.eci.entity.Candidate;

public class ECIClient {

	public static void main(String[] args) {

		ECIController controller = null;

		controller = new ECIController();
		List<Candidate> allCandidates = controller.getAllCandidates();
	
		System.out.println("*******************************************************************************************");
		System.out.println("                    All Candidates From Satara Region                ");
		System.out.println("*******************************************************************************************");
		
		for(Candidate candidate:allCandidates) {
			System.out.println(candidate);
			System.out.println("------------------------------------------------------------------------------------------");
		}

		List<Candidate> allIndcandidates = controller.getAllIndependentCandidates();

		System.out.println("************************************************************************************");
		System.out.println("                         All Independent Candidates                       ");
		System.out.println("************************************************************************************");
		for (Candidate candidate : allIndcandidates) {
			System.out.println(candidate);
			System.out.println("------------------------------------------------------------------------------------");

		}

//		List<Candidate>allncpcandidates=controller.getAllNCPCandidates();
//		
//		System.out.println("************************************************************************************");
//		System.out.println("                All Candidates of NCP                    ");
//		System.out.println("************************************************************************************");
//		
//		for(Candidate candidate:allncpcandidates) {
//			System.out.println( candidate);
//			System.out.println("-----------------------------------------------------------------------------------");
//		}

//		List<Candidate> allbjpcandidates = controller.getAllBJPCandidates();
//		System.out.println("****************************************************************************");
//		System.out.println("                          BJP Candidates                 ");
//		System.out.println("****************************************************************************");
//
//		for (Candidate candidate : allbjpcandidates) {
//			System.out.println(candidate);
//			System.out.println("----------------------------------------------------------------------------");
//
//		}
		
//		List<Candidate> allFemaleCandidates = controller.getAllFemaleCandidates();
//		System.out.println("******************************************************************************");
//		System.out.println("                         All Female Candidates                      ");
//		System.out.println("******************************************************************************");
//		
//		for (Candidate candidate : allFemaleCandidates) {
//			System.out.println(candidate);
//			System.out.println("------------------------------------------------------------------------------");
//			
//		}

	}

}
