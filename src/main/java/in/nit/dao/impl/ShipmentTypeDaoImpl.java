package in.nit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IshipmentTypeDao;
import in.nit.model.ShipmentType;

@Repository
public class ShipmentTypeDaoImpl implements IshipmentTypeDao{
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer SaveShipmentType(ShipmentType ob) {
		
		return (Integer) ht.save(ob);
	}


}
