/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.host.banking.entity;

import java.io.Serializable;

/**
 *
 * @author QXW5421
 */

public class Host implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private Integer cardId;
    
    private String cardHolderName;
    
    private String bankName;
    
    private int cardNumber;
   
    private int balance;
    
    private int transactionamount;
    
    private String transactiontype;
       
    private int pinNumber;
    
    private int cvvNumber;
    
    

    public Host() {
    }

    public Host(Integer cardId) {
        this.cardId = cardId;
    }

    public Host(Integer cardId, int cardNumber, int balance, int transactionamount, int pinNumber, int cvvNumber) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.transactionamount = transactionamount;
        this.pinNumber = pinNumber;
        this.cvvNumber = cvvNumber;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTransactionamount() {
        return transactionamount;
    }

    public void setTransactionamount(int transactionamount) {
        this.transactionamount = transactionamount;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getCvvNumber() {
        return cvvNumber;
    }

    public void setCvvNumber(int cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cardId != null ? cardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Host)) {
            return false;
        }
        Host other = (Host) object;
        if ((this.cardId == null && other.cardId != null) || (this.cardId != null && !this.cardId.equals(other.cardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.co.fnb.banking.entity.Fnb[ cardId=" + cardId + " ]";
    }
    
}
