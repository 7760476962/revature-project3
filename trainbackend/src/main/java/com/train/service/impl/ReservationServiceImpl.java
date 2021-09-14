package com.train.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.model.ReservationForm;
import com.train.model.RouteDetails;
import com.train.repository.ReservationRepository;
import com.train.service.ReservationService;
@Service
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	private ReservationRepository reservationRepository;
	
	@Override
	public ReservationForm addReservationForm(ReservationForm reservationForm) {
		
		return this.reservationRepository.save(reservationForm);
	}

	@Override
	public ReservationForm viewReservationForm(int bookingid) {
		// TODO Auto-generated method stub
		return this.reservationRepository.findById(bookingid).get();
	}

	@Override
	public List<ReservationForm> getReservationByCustId(Long custid) {
		// TODO Auto-generated method stub
		return this.reservationRepository.getReservationbyCustId(custid);
	}

}