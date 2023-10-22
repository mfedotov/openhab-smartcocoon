/**
 * Copyright (c) 2010-2023 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.smartcocoon.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link smartcocoonConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Mike Fedotov - Initial contribution
 */
@NonNullByDefault
public class smartcocoonConfiguration {

    /**
     * Sample configuration parameters. Replace with your own.
     */
    public String username = "";
    public String password = "";
    public int refreshInterval = 15;
    public String fanIdExt = "";
}
