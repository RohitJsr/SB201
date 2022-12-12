package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@ContController
public class AdminController {

	@Autowired
	private AdminService AService;
	
	@GetMapping("/tripbookings/{customerId}")
	public ResponseEntity<List<TripBooking>> getAllTrips(@PathVariable("customerId") Integer customerId) throws TripBookingException{
		
		List<TripBooking> listOfBooking=adminService.getAllTrips(customerId);
		return new ResponseEntity<List<TripBooking>>(listOfBooking,HttpStatus.OK);
		
	}
	
	@GetMapping("/tripbookings")
	public ResponseEntity<List<Driver>> getAllTripsDriverWise() throws DriverException{
		
		List<Driver> listOfBooking=adminService.getTripsDriver();
		return new ResponseEntity<List<Driver>>(listOfBooking,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/tripbookingsCustomerWise")
	public ResponseEntity<List<Customer>> getAllTripsCustomerWise() throws CustomerException{
		
		List<Customer> listOfBooking=adminService.getTripsCustomerwise();
		return new ResponseEntity<List<Customer>>(listOfBooking,HttpStatus.OK);
		
	}

	
	@GetMapping("/tripbookingsDateWise")
	public ResponseEntity<List<TripBooking>> getAllTripDateWise() throws TripBookingException{
		
		List<TripBooking> listOfBooking=adminService.getTripsDatewise();
		return new ResponseEntity<List<TripBooking>>(listOfBooking,HttpStatus.OK);
		
	}
	
	//
	//public List<TripBooking> getAllTripsForDays(Integer customerId,LocalDateTime fromDate,LocalDateTime toDate)
	@GetMapping("/tripbookings{customerId}/{fromDate}/{toDate}")
	public ResponseEntity<List<TripBooking>> getAllTripsbetwwenDays(@PathVariable("customerId")Integer customerId,@PathVariable("fromDate")LocalDateTime fromDate, @PathVariable("toDate")LocalDateTime toDate) throws TripBookingException{
		
		List<TripBooking> listOfBooking=adminService.getAllTripsForDays(customerId, fromDate, toDate);
		return new ResponseEntity<List<TripBooking>>(listOfBooking,HttpStatus.OK);
		
	}
}
