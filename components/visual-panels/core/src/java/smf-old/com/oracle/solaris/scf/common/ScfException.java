/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * You can obtain a copy of the license at usr/src/OPENSOLARIS.LICENSE
 * or http://www.opensolaris.org/os/licensing.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at usr/src/OPENSOLARIS.LICENSE.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright (c) 2009, 2012, Oracle and/or its affiliates. All rights reserved.
 */

package com.oracle.solaris.scf.common;

import com.oracle.solaris.rad.ObjectException;
import com.oracle.solaris.vp.panel.common.api.smf_old.SmfError;
import com.oracle.solaris.vp.panel.common.api.smf_old.SmfErrorCode;

/**
 * The SCF checked exeption class.
 *
 * XXX: This should be generated by ADRgen
 */
@SuppressWarnings({"serial"})
public class ScfException extends Exception
{
    private SmfErrorCode error_ = null;
    private String msg_ = "";

    public ScfException(ObjectException e)
    {
	super(e);
	SmfError se = e.getPayload(SmfError.class);
	if (se != null) {
	    error_ = se.getError();
	    msg_ = se.getMessage();
	} else {
	}
    }

    @Override
    public String getMessage()
    {
	    return (msg_);
    }

    /**
     * Returns the error which caused the ScfException.
     */
    public SmfErrorCode getError()
    {
	    return (error_);
    }
}
