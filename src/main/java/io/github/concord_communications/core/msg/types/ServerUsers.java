package io.github.concord_communications.core.msg.types;

import io.github.concord_communications.core.msg.Message;

/**
 * This message is sent from the server to the client whenever a change happens
 * which requires the server to notify clients about a change of the list of
 * global users.
 */
public record ServerUsers (UserData[] users) implements Message {}
