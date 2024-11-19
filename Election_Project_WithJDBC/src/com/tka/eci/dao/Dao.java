package com.tka.eci.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.eci.entity.Candidate;

public class Dao {
	String url = "jdbc:mysql://localhost:3306/advjava193";
	String uname = "root";
	String pwd = "root";
	String sql = "SELECT * FROM advjava193.candidate";

	List<Candidate> allcandidates = new ArrayList<Candidate>();

	public List<Candidate> getAllCandidates() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(url, uname, pwd);

			Statement statement = connection.createStatement();

			ResultSet set = statement.executeQuery(sql);

			while (set.next()) {
				int cid = set.getInt("c_id");
				String cname = set.getString("name");
				String cPartyName = set.getString("partyname");
				String assembly = set.getString("assembly");
				String stname = set.getString("statename");
				String cgender = set.getString("gender");
				int cage = set.getInt("age");

				Candidate candidate = new Candidate(cid, cname, cPartyName, assembly, stname, cgender, cage);

				allcandidates.add(candidate);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return allcandidates;

	}

}
