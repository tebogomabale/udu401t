/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.host.banking.exception;

/**
 *
 * @author QXW5421
 */
public class HostException extends Exception {

    /**
     * Creates a new instance of <code>FNBException</code> without detail
     * message.
     */
    public HostException() {
    }

    /**
     * Constructs an instance of <code>FNBException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public HostException(String msg) {
        super(msg);
    }
}
