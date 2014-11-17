/*
 * Copyright (C) 2007-2013, GoodData(R) Corporation. All rights reserved.
 * This program is made available under the terms of the BSD License.
 */
package com.gooddata.http.client;

import org.apache.http.HttpHost;

/**
 * Interface for class which encapsulates SST retrival.
 */
public interface SSTRetrievalStrategy {

    /**
     * Sets SST cookie to HTTP client.
     * @param verificationLevel Verification level.
     * @return SST
     */
    String obtainSst(VerificationLevel verificationLevel);

    /**
     * Returns host to be used to retrieve TT tokens.
     * @return http host (or null to retain backward compatibility with
     * {@link com.gooddata.http.client.SimpleSSTRetrievalStrategy#SimpleSSTRetrievalStrategy(String)})
     */
    HttpHost getTokenHost();

}
