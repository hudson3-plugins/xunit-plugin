/*******************************************************************************
 * Copyright (c) 2011 Thales Corporate Services SAS                             *
 * Author : Gregory Boissinot                                                   *
 *                                                                              *
 * Permission is hereby granted, free of charge, to any person obtaining a copy *
 * of this software and associated documentation files (the "Software"), to deal*
 * in the Software without restriction, including without limitation the rights *
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell    *
 * copies of the Software, and to permit persons to whom the Software is        *
 * furnished to do so, subject to the following conditions:                     *
 *                                                                              *
 * The above copyright notice and this permission notice shall be included in   *
 * all copies or substantial portions of the Software.                          *
 *                                                                              *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR   *
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,     *
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  *
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER       *
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,*
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN    *
 * THE SOFTWARE.                                                                *
 *******************************************************************************/

package com.thalesgroup.hudson.plugins.xunit.service;


import java.io.Serializable;
import java.util.logging.Logger;

public class XUnitService implements Serializable {

    private static final Logger LOGGER = Logger.getLogger("XUnitService");

    /**
     * Log an info output to the system logger
     *
     * @param message The message to be outputted
     */
    protected void infoSystemLogger(String message) {
        LOGGER.info("[xUnit] - " + message);
    }

    /**
     * Log an error output to the system logger
     *
     * @param message The message to be outputted
     */
    protected void errorSystemLogger(String message) {
        LOGGER.severe("[xUnit] - " + message);
    }

    /**
     * Log a warning output to the system logger
     *
     * @param message The message to be outputted
     */
    public void warningSystemLogger(String message) {
        LOGGER.warning("[xUnit] - " + message);
    }
}
