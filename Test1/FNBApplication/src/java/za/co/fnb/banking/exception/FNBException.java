/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.fnb.banking.exception;

/**
 *
 * @author QXW5421
 */
public class FNBException extends Exception {

    /**
     * Creates a new instance of <code>FNBException</code> without detail
     * message.
     */
    public FNBException() {
    }

    /**
     * Constructs an instance of <code>FNBException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public FNBException(String msg) {
        super(msg);
    }
}
