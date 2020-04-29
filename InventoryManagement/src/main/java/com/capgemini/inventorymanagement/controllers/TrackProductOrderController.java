package com.capgemini.inventorymanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagement.entities.TrackProductOrder;
import com.capgemini.inventorymanagement.exceptions.IdNotFoundException;
import com.capgemini.inventorymanagement.services.TrackProductOrderServiceImpl;

@RestController
@RequestMapping("/trackproduct")
public class TrackProductOrderController {
	
	@Autowired
	TrackProductOrderServiceImpl trackservice;

    //Add tracking
    @PostMapping("/addTrackproduct")
	   public ResponseEntity<String>addTrackProduct(@RequestBody TrackProductOrder t)
		{
    	    TrackProductOrder e = trackservice.addTrackProduct(t);
			if(e == null)
			{
				throw new IdNotFoundException("Enter Valid Id");
			}
			else {
				return new ResponseEntity<String>("tracking id created successfully",new HttpHeaders(),HttpStatus.OK);		
			}
		}
    
    // Get Particular tracking order
 		@GetMapping("/GetTrackProduct/{trackingid}")
       public ResponseEntity<TrackProductOrder> getTrackProductById(@PathVariable("trackingid") int trackingid) {
 			TrackProductOrder d = trackservice.getTrackProductById(trackingid);
 			if (d == null) {
 				throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
 			} else {
 				return new ResponseEntity<TrackProductOrder>(d, new HttpHeaders(), HttpStatus.OK);
 			}
 		}
 		
 	//Get all tracking details
 		@GetMapping("/GetAllTrackingProductdetails")
 		public ResponseEntity<List<TrackProductOrder>> getAllTrackProducts() 
 		    {
 			List<TrackProductOrder> trackinglist = trackservice.getAllTrackProducts();
 			return new ResponseEntity<List<TrackProductOrder>>(trackinglist, new HttpHeaders(), HttpStatus.OK);
 	        }
 		
 	//update tracking
 		 @PutMapping("/UpdateTackingProductDetail")
 		public ResponseEntity<String> updateTackProduct(@RequestBody TrackProductOrder t)
 			{
 			TrackProductOrder e = trackservice.updateTrackProduct(t);
 				if (e == null) {
 					throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
 				} else {
 					return new ResponseEntity<String>("tracking updated successfully", new HttpHeaders(), HttpStatus.OK);
 				}
 			}	
}
