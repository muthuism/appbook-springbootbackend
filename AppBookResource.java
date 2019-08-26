package com.appbook.resource;

import java.util.IntSummaryStatistics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.appbook.service.PersonService;

import com.appbook.pojo.PersonReqPojo;

@RestController
public class AppBookResource {

	@Autowired
	private PersonService personService;

	@PostMapping(value = "/addperson", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> addPerson(HttpServletRequest req, @RequestBody PersonReqPojo personReqPojo)
			throws Exception {

		return personService.addPerson(req, personReqPojo);

	}

	@GetMapping(value = "/findperson/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> findperson(HttpServletRequest req, @PathVariable("id") String id) throws Exception {
		public static String firstRepeatedWord(String s) {
			 
			String arr[]= s.split("/");

			ArrayList<Integer> al = new ArrayList<>();

			for(int i=0;i<arr.length;i++){

			for(int j=i+1;j<arr.length;j++){

			if(arr[i].equals(arr[j])){
			al.add(i);
			}
			}

			IntSummaryStatistics intv=al.stream().mapToInt((x) ->x).summaryStatistics();
			intv.getMin();

			System.out.print(intv.getMin());

			}
			
		
			String arr[]= s.split("//");

			return String.valueOf(intv.getMin());




			    }

			}
		return personService.findPerson(req, id);

	}

}