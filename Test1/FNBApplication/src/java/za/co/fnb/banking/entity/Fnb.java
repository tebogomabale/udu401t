/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.fnb.banking.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author QXW5421
 */
@Entity
@Table(name = "FNB", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fnb.findAll", query = "SELECT f FROM Fnb f")
    , @NamedQuery(name = "Fnb.findByCardId", query = "SELECT f FROM Fnb f WHERE f.cardId = :cardId")
    , @NamedQuery(name = "Fnb.findByCardHolderName", query = "SELECT f FROM Fnb f WHERE f.cardHolderName = :cardHolderName")
    , @NamedQuery(name = "Fnb.findByBankName", query = "SELECT f FROM Fnb f WHERE f.bankName = :bankName")
    , @NamedQuery(name = "Fnb.findByCardNumber", query = "SELECT f FROM Fnb f WHERE f.cardNumber = :cardNumber")
    , @NamedQuery(name = "Fnb.findByBalance", query = "SELECT f FROM Fnb f WHERE f.balance = :balance")
    , @NamedQuery(name = "Fnb.findByTransactionamount", query = "SELECT f FROM Fnb f WHERE f.transactionamount = :transactionamount")
    , @NamedQuery(name = "Fnb.findByTransactiontype", query = "SELECT f FROM Fnb f WHERE f.transactiontype = :transactiontype")
    , @NamedQuery(name = "Fnb.findByPinNumber", query = "SELECT f FROM Fnb f WHERE f.pinNumber = :pinNumber")
    , @NamedQuery(name = "Fnb.findByCvvNumber", query = "SELECT f FROM Fnb f WHERE f.cvvNumber = :cvvNumber")})
public class Fnb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "CARD_ID")
    private Integer cardId;
    //@Size(max = 250)
    @Column(name = "CARD_HOLDER_NAME")
    private String cardHolderName;
    //@Size(max = 250)
    @Column(name = "BANK_NAME")
    private String bankName;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "CARD_NUMBER")
    private int cardNumber;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "BALANCE")
    private int balance;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "TRANSACTIONAMOUNT")
    private int transactionamount;
    //@Size(max = 250)
    @Column(name = "TRANSACTIONTYPE")
    private String transactiontype;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "PIN_NUMBER")
    private int pinNumber;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "CVV_NUMBER")
    private int cvvNumber;
    
    

    public Fnb() {
    }

    public Fnb(Integer cardId) {
        this.cardId = cardId;
    }

    public Fnb(Integer cardId, int cardNumber, int balance, int transactionamount, int pinNumber, int cvvNumber) {
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
        if (!(object instanceof Fnb)) {
            return false;
        }
        Fnb other = (Fnb) object;
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
