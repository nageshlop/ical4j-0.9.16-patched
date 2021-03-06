/*
 * $Id: Uris.java,v 1.1 2005/09/11 11:43:19 fortuna Exp $
 *
 * Created on 11/09/2005
 *
 * Copyright (c) 2005, Ben Fortuna
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  o Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 *  o Neither the name of Ben Fortuna nor the names of any other contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.fortuna.ical4j.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Utility methods for working with URIs.
 * @author Ben Fortuna
 */
public final class Uris {

    private static final String ENCODING_CHARSET = "UTF-8";
    
    private static Log log = LogFactory.getLog(Uris.class);
    
    /**
     * Constructor made private to enforce static nature.
     */
    private Uris() {
    }

    /**
     * Encodes the specified URI string using the UTF-8 charset. In the
     * event that an exception is thrown, the specifed URI string is
     * returned unmodified.
     * @param s a URI string
     * @return an encoded URI string
     */
    public static String encode(final String s) {
        
        //
        // tim: commented out: URL encoding is causing havok with MAILTO uri's
        //
//        try {
//            return URLEncoder.encode(s, ENCODING_CHARSET);
//        }
//        catch (UnsupportedEncodingException use) {
//            log.error("Error ocurred encoding URI [" + s + "]", use);
//        }
        return s;
    }
    
    /**
     * Decodes the specified URI string using the UTF-8 charset. In the
     * event that an exception is thrown, the specifed URI string is
     * returned unmodified.
     * @param s a URI string
     * @return an encoded URI string
     */
    public static String decode(final String s) {
        
        //
        // tim: commented out: URL encoding is causing havok with MAILTO uri's
        //
        
//        try {
//            return URLDecoder.decode(s, ENCODING_CHARSET);
//        }
//        catch (UnsupportedEncodingException use) {
//            log.error("Error ocurred decoding URI [" + s + "]", use);
//        }
        return s;
    }
}
