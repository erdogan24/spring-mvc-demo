package com.springdemo.mvc;

@Conttoller
@RequestMappin("/customer")
public class CustomerController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", newCustomer());

		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModeiAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {

		System.out.println("Last name :" + theCustomer.getLastName() + " ");

		System.out.println("Binding result:" + theBindingResult);
		
		System.out.println("\n\n\n\n");
		
		if (theBindingResult.hasError()) {
			return "customer-form";
		} else {

			return "customer-confirmation";
		}

	}
}
