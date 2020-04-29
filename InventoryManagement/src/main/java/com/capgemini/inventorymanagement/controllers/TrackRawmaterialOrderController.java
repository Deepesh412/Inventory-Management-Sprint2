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

import com.capgemini.inventorymanagement.entities.TrackRawMaterialOrder;
import com.capgemini.inventorymanagement.exceptions.IdNotFoundException;
import com.capgemini.inventorymanagement.services.TrackRawMaterialOrderServiceImpl;

@RestController
@RequestMapping("/trackrawmaterial")
public class TrackRawmaterialOrderController {
	
	@Autowired
	TrackRawMaterialOrderServiceImpl trackservice;

    //Add tracking
    @PostMapping("/addTrackrawmaterial")
	   public ResponseEntity<String>addTrackRawMaterial(@RequestBody TrackRawMaterialOrder r)
		{
    	TrackRawMaterialOrder e = trackservice.addTrackRawMaterial(r);
			if(e == null)
			{
				throw new IdNotFoundException("Enter Valid Id");
			}
			else {
				return new ResponseEntity<String>("tracking id created successfully",new HttpHeaders(),HttpStatus.OK);		
			}
		}
    
    // Get Particular tracking order
 		@GetMapping("/GetTrackRawMaterialOrder/{trackingid}")
       public ResponseEntity<TrackRawMaterialOrder> getTrackRawMaterialById(@PathVariable("trackingid") int trackingid) {
 			TrackRawMaterialOrder d = trackservice.getTrackRawMaterialById(trackingid);
 			if (d == null) {
 				throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
 			} else {
 				return new ResponseEntity<TrackRawMaterialOrder>(d, new HttpHeaders(), HttpStatus.OK);
 			}
 		}
 		
 	//Get all tracking details
 		@GetMapping("/GetAllTrackingrawmaterialdetails")
 		public ResponseEntity<List<TrackRawMaterialOrder>> getAllTrackRawMaterials() 
 		    {
 			List<TrackRawMaterialOrder> trackinglist = trackservice.getAllTrackRawmaterials();
 			return new ResponseEntity<List<TrackRawMaterialOrder>>(trackinglist, new HttpHeaders(), HttpStatus.OK);
 	        }
 		
 	//update tracking
 		 @PutMapping("/UpdateTackingrawmaterialDetail")
 		public ResponseEntity<String> updateTrackRawMaterial(@RequestBody TrackRawMaterialOrder r)
 			{
 			TrackRawMaterialOrder e = trackservice.updateTrackRawMaterial(r);
 				if (e == null) {
 					throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
 				} else {
 					return new ResponseEntity<String>("tracking updated successfully", new HttpHeaders(), HttpStatus.OK);
 				}
 			}	
}
