package com.capgemini.inventorymanagement.services;


import java.util.List;
import com.capgemini.inventorymanagement.entities.RawMaterialDetails;

public interface RawMaterialDetailsService
{

	RawMaterialDetails addDetails(RawMaterialDetails r);
     
     List<RawMaterialDetails>getAllDetails();
     
     RawMaterialDetails getRawMaterialDetailById(int rawmaterialid);
     
     RawMaterialDetails deleteRawMaterialDetail(int rawmaterialid);
     
     RawMaterialDetails updateDetails(RawMaterialDetails r);
}


