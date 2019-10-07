/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.absa.banking.exception;

/**
 *
 * @author QXW5421
 */
public class ABSAException extends Exception {

    /**
     * Creates a new instance of <code>ABSAException</code> without detail
     * message.
     */
    public ABSAException() {
    }

    /**
     * Constructs an instance of <code>ABSAException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ABSAException(String msg) {
        super(msg);
    }
}
