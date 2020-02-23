package in.nit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IshipmentTypeDao;
import in.nit.model.ShipmentType;
import in.nit.service.IshipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IshipmentTypeService {
	@Autowired
	private IshipmentTypeDao dao;
	
	public Integer SaveShipmentType(ShipmentType ob) {
		
		return dao.SaveShipmentType(ob) ;
	}

}
