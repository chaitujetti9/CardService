package com.jetti.rest;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Card {

	int cardId;
	String cardNumber;
	String nameOnCard;
	int expiryDate;
	int cardBalance;
	int cvv;
	

	public Card() {
	
	}
	public int getCardId() {
		return cardId;
	}
	@XmlElement
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardNumber() {
		return cardNumber;
	}
	@XmlElement
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}
	@XmlElement
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public int getExpiryDate() {
		return expiryDate;
	}
	@XmlElement
	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getCardBalance() {
		return cardBalance;
	}
	@XmlElement
	public void setCardBalance(int cardBalance) {
		this.cardBalance = cardBalance;
	}

	public int getCvv() {
		return cvv;
	}
	@XmlElement
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public Card(String cardNumber, String nameOnCard, int expiryDate, int cardBalance, int cvv) {
		super();
		this.cardNumber = cardNumber;
		this.nameOnCard = nameOnCard;
		this.expiryDate = expiryDate;
		this.cardBalance = cardBalance;
		this.cvv = cvv;
	}

}
