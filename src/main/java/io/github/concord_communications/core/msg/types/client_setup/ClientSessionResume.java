package io.github.concord_communications.core.msg.types.client_setup;

import io.github.concord_communications.core.msg.Message;

/**
 * This message is sent by the client to log into a server using a session token
 * instead of a username/password combination.
 */
public record ClientSessionResume(String sessionToken) implements Message {}
