package in.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.nit.model.ShipmentType;
import in.nit.service.IshipmentTypeService;


@RequestMapping("/shipment")
@Controller
public class ShipmentTypeController {

	@Autowired
	private IshipmentTypeService service;

	@RequestMapping("/register")
	public String ShowRegisterpage(Model model) {
		model.addAttribute("shipmentType", new ShipmentType());
		return "ShipmentTypeRegisterPage";

	}

	@RequestMapping(value= "/save", method=RequestMethod.POST)
	public String saveShipment(@ModelAttribute ShipmentType shipmentType, Model model) { 

		Integer Id= service.SaveShipmentType(shipmentType);
		String message= "ShipmentType'"+Id+"'save";
		model.addAttribute("message", message);
		model.addAttribute("shipmentType", new ShipmentType());
		return "ShipmentTypeRegisterPage";

	}

}


