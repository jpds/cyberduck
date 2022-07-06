package ch.cyberduck.core.ctera;

/*
 * Copyright (c) 2002-2022 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.AbstractPath;
import ch.cyberduck.core.Credentials;
import ch.cyberduck.core.DisabledCancelCallback;
import ch.cyberduck.core.DisabledHostKeyCallback;
import ch.cyberduck.core.DisabledLoginCallback;
import ch.cyberduck.core.Host;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.proxy.Proxy;
import ch.cyberduck.core.ssl.DefaultX509KeyManager;
import ch.cyberduck.core.ssl.DisabledX509TrustManager;
import ch.cyberduck.test.IntegrationTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.EnumSet;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@Category(IntegrationTest.class)
public class CteraCustomActionVersioningTest {

    @Test
    public void testSessionToken() throws Exception {
        final Host host = new Host(new CteraProtocol(), "mountainduck.ctera.me", new Credentials(
                System.getProperty("ctera.user"), System.getProperty("ctera.password"),
                System.getProperty("ctera.token")
        ));
        host.setDefaultPath("/ServicesPortal/webdav");
        final CteraSession session = new CteraSession(host, new DisabledX509TrustManager(), new DefaultX509KeyManager());
        assertNotNull(session.open(Proxy.DIRECT, new DisabledHostKeyCallback(), new DisabledLoginCallback(), new DisabledCancelCallback()));
        assertTrue(session.isConnected());
        assertNotNull(session.getClient());
        session.login(Proxy.DIRECT, new DisabledLoginCallback(), new DisabledCancelCallback());

        final Path file = new Path("/My Files/dummy", EnumSet.of(AbstractPath.Type.file));
        final CteraCustomActionVersioning action = new CteraCustomActionVersioning(session, file) {
            @Override
            protected String getCteraTokens() {
                return System.getProperty("ctera.token");
            }
        };
        action.run();
        assertNotNull(action.getSessionToken());
        session.close();
    }
}