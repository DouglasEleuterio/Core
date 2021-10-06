package io.github.concord_communication.core.msg.types.client_setup;

import io.github.concord_communication.core.msg.Message;

/**
 * This message is sent by clients to log into a server that they have already
 * registered with, but don't have a valid session token for.
 */
public record ClientLogin(String username, String password) implements Message {}
