/*
 * Copyright (C) 2007-2013, GoodData(R) Corporation. All rights reserved.
 * This program is made available under the terms of the BSD License.
 */
package com.gooddata.http.client;

import org.apache.http.HttpHost;

import static org.apache.commons.lang.Validate.notNull;

/**
 * Provides super-secure token (SST)
 */
public class SimpleSSTRetrievalStrategy implements SSTRetrievalStrategy {

    private final String sst;

    private final HttpHost httpHost;

    /**
     * Creates new instance.
     * @param sst super-secure token (SST)
     * @deprecated use host aware constructor
     */
    @Deprecated
    public SimpleSSTRetrievalStrategy(final String sst) {
        this(sst, null);
    }

    /**
     * Creates new instance.
     * @param sst super-secure token (SST)
     * @param httpHost http host
     */
    public SimpleSSTRetrievalStrategy(final String sst, final HttpHost httpHost) {
        notNull(sst, "No SST set.");
        this.sst = sst;
        this.httpHost = httpHost;
    }

    @Override
    public String obtainSst(VerificationLevel verificationLevel) {
        return sst;
    }

    @Override
    public HttpHost getTokenHost() {
        return httpHost;
    }

}
